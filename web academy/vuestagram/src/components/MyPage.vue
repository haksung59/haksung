<template>
  <div style="padding : 10px">
    <h4>팔로워</h4>
    <input placeholder="?" @input="search($event.target.value)" />
    <div class="post-header" v-for="follower in searchFollowers" :key="follower">
      <div class="profile" :style="`background-image: url(${follower.image})`"></div>
      <span class="profile-name">{{ follower.name }}</span>
    </div>
  </div>
  <button @click="console.log(inputTxt)">button</button>
</template>
<script>
import { onMounted,ref/*,watch,toRefs,computed,reactive*/ } from 'vue';
import axios from "axios";
// import useStore from "vuex";

export default{
  name: 'MyPage',
  setup(){
    let followers = ref([]);
    let searchFollowers = ref([]);

    onMounted(()=>{
      axios.get('/follower.json').then((a)=>{
        followers.value = a.data
        searchFollowers.value = a.data
      })
    })

    function search(inputTxt){
      searchFollowers.value = followers.value
      searchFollowers.value = searchFollowers.value.filter(function(hi){
        return hi.name.includes(inputTxt);
      });
    }

    return {followers, searchFollowers, search}
    // let test = reactive({ name : 'kim' };

    // let { one } = toRefs(props);
    // console.log(one.value);
    //

    // let computedResult = computed(()=>{
    //   return followers.value.length;
    // })
    // console.log(computedResult)
  },
}
</script>
<style>
</style>