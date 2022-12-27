import { createWebHistory, createRouter } from "vue-router";
import BlogList from './components/BlogList.vue';
import HomePage from './components/HomePage.vue';
import BlogDetail from './components/BlogDetail.vue';
import BlogComment from "./components/BlogComment.vue";
import BlogAuthor from "./components/BlogAuthor.vue";

const routes = [
    {
        path: "/list",
        component: BlogList,
    },
    {
        path: "/list/:number",
        component: BlogDetail,
        children:[
            {
                path:"author",
                component: BlogAuthor,
            },
            {
                path:"comment",
                component: BlogComment,
            }
        ]
    },
    {
        path: "/",
        component: HomePage,
    },
    {
        path: "/:anything(.*)",
        component: HomePage,
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router; 