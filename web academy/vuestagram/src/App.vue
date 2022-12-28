<template>
  <div class="header">
    <ul class="header-button-left">
      <li>Cancel</li>
    </ul>
    <ul v-if="showContent>0" class="header-button-right">
      <li v-if="showContent==1" @click="showContent++">Next</li>
      <li v-if="showContent==2" @click="publish()">발행</li>
    </ul>
    <img src="./assets/logo.png" class="logo" />
  </div>

  <ContainerBox :postData="postData" :showContent="showContent" :selectFilter="selectFilter"
                :uploadImage="uploadImage" @write="writedContent=$event"/>
<!--  <button @click="more">더보기</button>-->

  <p>{{now()}}</p>
  <p>{{now2}} / {{counter}}</p>
  <p>{{name}}</p>
  <button @click="counter++">버튼</button>

  <div class="footer">
    <ul class="footer-button-plus">
      <input @change="upload" accept="image/*" type="file" id="file" class="inputfile" />
      <label for="file" class="input-plus">+</label>
    </ul>
  </div>

  <h4>안녕 {{ $store.state.name }}</h4>
  <button @click="changeName('hi')">change</button>

  <p>{{ $store.state.more }}</p>
  <button @click="$store.dispatch('getData')">더보기버튼</button>

</template>

<script>
import ContainerBox from './components/ContainerBox.vue';
import postData from './assets/data.json';
import axios from 'axios';
import {mapState, mapMutations} from 'vuex';

export default {
  name: 'App',
  data(){
    return {
      postData: postData,
      postDataOriginal: [...postData],
      clickTimes: 0,
      showContent: 3,
      uploadImage: null,
      writedContent: "",
      selectFilter: "",
      counter: 0,
    }
  },
  mounted(){
    this.emitter.on('fire', (a)=>{
      this.selectFilter = a;
    })
  },
  components: {
    ContainerBox
  },
  computed: {
    name(){
      return this.$store.state.name;
    },
    ...mapState(['isLikes', 'age', "likes"]),
    now2(){
      return new Date();
    },
  },
  methods: {
    ...mapMutations(['changeName']),
    now() {
      return new Date();
    },
    more() {
      this.clickTimes++
      if (this.clickTimes % 2 == 1) {
        axios.get("https://codingapple1.github.io/vue/more0.json")
            .then((result) => {
              this.postData.push(result.data);
            })
      }else {
        axios.get("https://codingapple1.github.io/vue/more1.json")
            .then((result) => {
              this.postData.push(result.data);
            })
      }
    },
    changeContent(no){
      this.showContent = no;
    },
    upload(e){
      let files = e.target.files;
      let url = URL.createObjectURL(files[0]);
      this.uploadImage = url;
      this.showContent = 1;
    },
    publish(){
      var publishItem = {
        "name": "Kim Hak Sung",
        "userImage": "https://placeimg.com/100/100/arch",
        "postImage": this.uploadImage ,
        "likes": 0,
        "date": "Today",
        "liked": false,
        "content": this.writedContent,
        "filter": this.selectFilter
      };
      this.postData.unshift(publishItem);
      this.showContent = 0;
      this.uploadImage = null;
      this.selectFilter = null;
    }
  }
}
</script>

<style>
body {
  margin: 0;
}
ul {
  padding: 5px;
  list-style-type: none;
}
.logo {
  width: 22px;
  margin: auto;
  display: block;
  position: absolute;
  left: 0;
  right: 0;
  top: 13px;
}
.header {
  width: 100%;
  height: 40px;
  background-color: white;
  padding-bottom: 8px;
  position: sticky;
  top: 0;
}
.header-button-left {
  color: skyblue;
  float: left;
  width: 50px;
  padding-left: 20px;
  cursor: pointer;
  margin-top: 10px;
}
.header-button-right {
  color: skyblue;
  float: right;
  width: 50px;
  cursor: pointer;
  margin-top: 10px;
}
.footer {
  width: 100%;
  position: sticky;
  bottom: 0;
  padding-bottom: 10px;
  background-color: white;
}
.footer-button-plus {
  width: 80px;
  margin: auto;
  text-align: center;
  cursor: pointer;
  font-size: 24px;
  padding-top: 12px;
}
.sample-box {
  width: 100%;
  height: 600px;
  background-color: bisque;
}
.inputfile {
  display: none;
}
.input-plus {
  cursor: pointer;
}
</style>
