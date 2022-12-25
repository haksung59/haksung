<template id="main-page">

  <div class="black-bg" v-if="모달창열렸니">
    <div class="white-bg">
      <h4>{{ products[clickNo].title }}}</h4>
      <img class="modalImg" :src="products[clickNo].image">
      <p>{{ products[clickNo].content }}</p>
      <button @click="modal">닫기</button>
    </div>
  </div>

  <div class="menu">
    <a v-for="menuidx in pages" :key="menuidx">{{ menuidx }}</a>
  </div>

  <img alt="Vue logo" src="./assets/logo.png">
  원룸샵
  <div v-for="(product,i) in products" :key="i">
    <img :src="product.image" class="room-img">
    <h4 @click="modal(i)">{{ product.title }}</h4>
    <p>{{ product.price }} 원</p>
  </div>
</template>

<script>

import data from './assets/oneroom.js';

export default {
  name: 'App',
  data(){
    return {
      모달창열렸니 : false,
      products : data,
      clickNo : 0,
    }
  },
  methods : {
    increase(i) {
      this.신고수[i]++
    },
    modal(i){
      this.모달창열렸니 = !this.모달창열렸니
      this.clickNo = i
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
.modalImg {
  width: 100%;
}

</style>
