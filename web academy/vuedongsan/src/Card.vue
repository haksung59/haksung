<template>
  <div v-for="(product,i) in products" :key="i">
    <img :src="product.image" class="room-img">
    <h4 @click="$emit('openModal', i)">{{ product.title }}</h4>
    <p>{{ product.price }} 원</p>
  </div>
</template>

<script>
export default{
  // eslint-disable-next-line vue/multi-word-component-names
  name: 'Card',
  props: {
    products: Array
  }
}
</script>

<style>

</style>