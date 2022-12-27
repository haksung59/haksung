<template>
  <div>
    <h4>{{blogDetail.title}}</h4>
    <h5>{{ blogDetail.content }}</h5>
    <p>{{ blogDetail.detail }}</p>
  </div>
</template>

<script>
export default{
  name: 'blogDetail',
  props: {
    blogDetail: Object
  },
}
</script>

<style></style>