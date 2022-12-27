<template>
  <div v-for="blog in blogList" :key="blog">
    <h5 @click="push('/list/'+blog.number, blog)">{{blog.title}}</h5>
    <p>{{ blog.date }}</p>
  </div>
</template>

<script>
import router from "@/router";

export default {
  name: 'blogList',
  props: {
    blogList: Array,
    blogDetail: Object,
    setBlogDetail: Function,
  },
  methods:{
    push(url, blog){
      this.setBlogDetail(blog)
      router.push(url)
    }
  }
}
</script>

<style>

</style>