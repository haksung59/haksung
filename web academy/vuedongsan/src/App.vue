<template>

  <div class="black-bg" v-if="모달창열렸니">
    <div class="white-bg">
      <h4>상세페이지임</h4>
      <p>상세페이지 내용임</p>
      <button @click="modal">닫기</button>
    </div>
  </div>

  <div class="menu">
    <a v-for="menuidx in pages" :key="menuidx">{{ menuidx }}</a>
  </div>

  <img alt="Vue logo" src="./assets/logo.png">
  원룸샵
  <div v-for="(a,i) in products" :key="i">
    <img :src="products[i].image" class="room-img">
    <h4 @click="modal()">{{ products[i].title }}</h4>
    <p>{{ products[i].price }} 만원</p>
    <button @click="increase(i)">허위매물신고</button> <span>신고수 : {{ 신고수[i] }}</span>
  </div>
</template>

<script>

import data from './assets/oneroom.js';

export default {
  name: 'App',
  data(){
    return {
      모달창열렸니 : false,
      신고수 : [0, 0, 0, 0, 0, 0],
      products : data
    }
  },
  methods : {
    increase(i) {
      this.신고수[i]++
    },
    modal(){
      this.모달창열렸니 = !this.모달창열렸니
    }
  },
  components: {
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

body {
  margin : 0
}
div {
  box-sizing: border-box;
}
.black-bg{
  width: 100%; height: 100%;
  background: rgba(0,0,0,0.5);
  position: fixed; padding: 20px;
}
.white-bg {
  width: 100%; background: white;
  border-radius: 8px;
  padding: 20px;
}

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}
.menu a {
  color: white;
  padding: 10px;
}
.room-img {
  width: 100%;
  margin-top: 40px;
}

</style>
