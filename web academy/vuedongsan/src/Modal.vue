<template>
  <div class="black-bg">
    <div class="white-bg">
      <h4>{{ product.title }}}</h4>
      <img class="modalImg" :src="product.image">
      <p>{{ product.content }}</p>
<!--      <input @input="month = $event.target.value">-->
      <input v-model.number="month">
      <p> {{ month }}개월 선택함 : {{ month * product.price }}원</p>
      <button @click="$emit('closeModal')">닫기</button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ModalPage',
  data(){
    return {
      month: 3,
    }
  },
  watch : {
    month(a){
      if(a > 12) {
        alert('3~12의 숫자를 입력해주세요.')
        this.month = 3
      }else if(isNaN(a)){
        alert('숫자만 입력하시오.')
        this.month = 3
      }
    },
  },
  beforeUpdate() {
    if(this.month < 3) {
      alert('3개월부터 예약 가능합니다.')
      this.month = 3
    }
  },
  props: {
    product: Object,
  }
}
</script>

<style>

</style>