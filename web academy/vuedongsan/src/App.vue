<template id="main-page">

  <Modal :products="products" :isOpenModal="isOpenModal" :clickNo="clickNo" :modal="modal"/>

  <div class="menu">
    <a v-for="menuidx in pages" :key="menuidx">{{ menuidx }}</a>
  </div>

  <Discount />
  <Card :products="products" :isOpenModal="isOpenModal" :clickNo="clickNo" :modal="modal"/>

</template>

<script>

import data from './assets/oneroom.js';
import Discount from "./Discount.vue";
import Modal from "./Modal.vue";
import Card from "./Card.vue";

export default {
  name: 'App',
  data(){
    return {
      isOpenModal : false,
      products : data,
      clickNo : 0,
    }
  },
  methods : {
    modal(i){
      this.isOpenModal = !this.isOpenModal
      this.clickNo = i
    }
  },
  components: {
    Discount,
    Modal,
    Card,
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

.discount {
  background: #eee;
  padding: 10px;
  margin: 10px;
  border-radius: 5px;
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
