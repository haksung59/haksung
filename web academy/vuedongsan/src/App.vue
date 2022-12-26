<template id="main-page">

  <transition name="fade">
    <Modal v-if="isOpenModal" @closeModal="modal()" :product="products[clickNo]"/>
  </transition>

  <div class="menu">
    <a v-for="menuidx in pages" :key="menuidx">{{ menuidx }}</a>
  </div>

  <Discount v-if="showDiscount == true" :discount="discount" />

  <p>원룸샵</p>

  <button @click="priceSort">가격순정렬</button>
  <button @click="sortBack">정렬 되돌리기</button>

  <Card @openModal="modal($event)" :products="products"/>

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
      showDiscount: true,
      productsOriginal: [...data],
      isOpenModal : false,
      products : data,
      clickNo : 0,
      discount: 30,
      pages: ['Home', 'Shop', 'About']
    }
  },
  methods : {
    modal(i){
      this.isOpenModal = !this.isOpenModal;
      this.clickNo = i;
    },
    sortBack(){
      this.products = [...this.productsOriginal];
    },
    priceSort(){
      this.products.sort(function(a,b){
        return a.price - b.price
      });//원본이 변형됨
    }
  },
  mounted() {
    setInterval(() => {
      this.discount--;
    }, 1000)
  },
  components: {
    Discount,
    Modal,
    Card,
  }
}
</script>

<style>
.fade-leave-from{
  opacity: 1;
}
.fade-leave-active{
  transition: all 1s;
}
.fade-leave-to{
  opacity: 0;
}

.fade-enter-from {
  transform: translateY(-1000px);
}
.fade-enter-active {
  transition: all 1s;
}
.fade-enter-to {
  transform: translateY(0px);
}

body {
  margin : 0;
  text-align: center;
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
