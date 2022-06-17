import Router from "vue-router";
import Vue from "vue";
Vue.use(Router);

import Test from '@/components/Test';
import Testa from '@/components/Testa';

import ShopIndex from '@/components/shop/ShopIndex';
import AdminIndex from '@/components/admin/AdminIndex';
import ShoppingCart from '@/components/shop/shoppingcart/ShoppingCart';
import PersonalInfomation from '@/components/shop/personalinfomation/PersonalInfomation';

export default new Router({
    // mode: history,
    routes: [{
            name: 'ShopIndex',
            path: '/',
            component: ShopIndex
        },
        {
            name: 'AdminIndex',
            path: '/adminIndex',
            component: AdminIndex
        },
        {
            name: 'ShoppingCart',
            path: '/shoppingCart',
            component: ShoppingCart
        },
        {
            name: 'Test',
            path: '/test',
            component: Test
        },
        {
            name: 'Testa',
            path: '/testa',
            component: Testa
        },
        {
            name: 'PersonalInfomation',
            path: '/infomation',
            component: PersonalInfomation
        },
    ]

})