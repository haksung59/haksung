<template>
  <div>
    <div v-if="showContent==0" >
      <PostBox v-for="item in postData" :key="item" :postOne=item />
    </div>

    <div v-if="showContent==1">
      <div class="upload-image" :style="`background-image : url(${uploadImage})`"/>
      <div class="filters">
        <FilterBox v-for="filter in filters" :key="filter" :uploadImage="uploadImage" :filter="filter">
        </FilterBox>
      </div>
    </div>

    <div v-if="showContent==2">
      <div class="upload-image"
           :style="`background-image : url(${uploadImage})`" />
      <div class="write">
        <textarea @input="$emit('write', $event.target.value)"
                  class="write-box">
        </textarea>
      </div>
    </div>

  </div>
</template>

<script>
import PostBox from './PostBox.vue';
import FilterBox from './FilterBox.vue';

export default{
  name: 'ContainerBox',
  data(){
    return {
    filters : ["aden", "_1977", "brannan", "brooklyn", "clarendon",
              "earlybird", "gingham", "hudson", "inkwell", "kelvin",
              "lark", "lofi", "maven", "mayfair", "moon", "nashville",
              "perpetua", "reyes", "rise", "slumber", "stinson", "toaster",
              "valencia", "walden", "willow", "xpro2"],
    }
  },
  props: {
    postData: Array,
    showContent: Number,
    uploadImage: String,
  },
  components: {
    PostBox, FilterBox
  }
}
</script>

<style>
.upload-image{
  width: 100%;
  height: 450px;
  background: cornflowerblue;
  background-size : cover;
}
.filters{
  overflow-x:scroll;
  white-space: nowrap;
}
.filter-1 {
  width: 100px;
  height: 100px;
  background-color: cornflowerblue;
  margin: 10px 10px 10px auto;
  padding: 8px;
  display: inline-block;
  color : white;
  background-size: cover;
}
.filters::-webkit-scrollbar {
  height: 5px;
}
.filters::-webkit-scrollbar-track {
  background: #f1f1f1;
}
.filters::-webkit-scrollbar-thumb {
  background: #888;
  border-radius: 5px;
}
.filters::-webkit-scrollbar-thumb:hover {
  background: #555;
}
.write-box {
  border: none;
  width: 90%;
  height: 100px;
  padding: 15px;
  margin: auto;
  display: block;
  outline: none;
}
</style>