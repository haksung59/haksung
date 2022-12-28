import {createStore } from 'vuex';
import axios from 'axios';

const store = createStore({
    state () {
        return {
            name : 'kim',
            age : 20,
            likes : 30,
            isLikes : false,
            more : {},
        }
    },
    mutations: {
        changeLikes(state){
            if(!state.isLikes) {
                state.likes++;
                state.isLikes = true;
            }else {
                state.likes--;
                state.isLikes = false;
            }
        },
        changeName(state, a){
            state.name = a;
        },
        plusAge(state){
            state.age++;
        },
        setMore(state, data){
            state.more = data;
        },
    },
    actions : {
        getData(context){
            axios.get("https://codingapple1.github.io/vue/more0.json")
                .then((a)=>{
                    context.commit('setMore', a.data);
                })
        }
    }
})

export default store;