<template>
  <div class="post">
    <div class="post-header">
      <div class="profile"
           v-bind:style="{ backgroundImage : 'url( '+postOne.userImage+' )' }"/>
      <span class="profile-name">{{ postOne.name }}</span>
    </div>
    <div :class="postOne.filter" class="post-body"
         @click="$store.commit('changeLikes')"
         v-bind:style="{ backgroundImage: 'url(' + postOne.postImage + ')' }"/>
    <div class="post-content">
      <p>{{ $store.state.likes }} Likes</p>
      <p><strong>{{ postOne.filter }}</strong> {{postOne.content}}</p>
      <p class="date">{{postOne.date}}</p>
    </div>
  </div>
</template>
<script>
export default{
  name: 'PostBox',
  props:{
    postOne: Object,
  },
  methods: {

  }
}
</script>
<style>
.post {
  width: 100%;
}
.profile {
  width: 30px;
  height: 30px;
  background-size: 100%;
  border-radius: 50%;
  float: left;
}
.profile-name {
  display: block;
  float: left;
  padding-left: 10px;
  padding-top: 7px;
  font-size: 14px;
}
.post-header {
  height: 30px;
  padding: 10px;
}
.post-body {
  height: 450px;
  background-position: center;
  background-size: cover;
}
.post-content {
  padding-left: 15px;
  padding-right: 15px;
  font-size: 14px;
}
.date {
  font-size: 11px;
  color: grey;
  margin-top: -8px;
}
</style>