import Vue from 'vue'
import Router from 'vue-router'
import pizzaVue from '../components/pizza.vue'
import saladsVue from '../components/salads.vue'
import starterVue from '../components/starter.vue'

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            name: 'pizza',
            component: pizzaVue
        },
        {
            path: '/salads',
            name: 'salads',
            component: saladsVue
        },
        {
            path: '/starter',
            name: 'starter',
            component: starterVue
        }
    ]
});
