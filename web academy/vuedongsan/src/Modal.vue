<template>
  <div class="black-bg" v-if="isOpenModal">
    <div class="white-bg">
      <h4>{{ products[clickNo].title }}}</h4>
      <img class="modalImg" :src="products[clickNo].image">
      <p>{{ products[clickNo].content }}</p>
      <button @click="modal">닫기</button>
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: 'Modal',
  props: {
    products: Array,
    isOpenModal: Boolean,
    clickNo: Number,
    modal: Function,
  }
}
</script>

<style>

</style>