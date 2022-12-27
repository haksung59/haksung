<template>
  <div>
    <PostBox v-for="item in postData" :key="item" :postOne=item />
  </div>
</template>

<script>
import PostBox from './PostBox.vue';

export default{
  name: 'ContainerBox',
  props: {
    postData: Array,
  },
  components: {
    PostBox,
  }
}
</script>

<style>

</style>