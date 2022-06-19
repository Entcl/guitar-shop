import Router from "vue-router";
import Vue from "vue";
Vue.use(Router);

import Test from '@/components/Test';
import Testa from '@/components/Testa';
import Testaa from '@/components/Testaa';
import Testaaa from '@/components/Testaaa';
import Testaaaa from '@/components/Testaaaa';

import ShopIndex from '@/components/shop/ShopIndex';
import AdminIndex from '@/components/admin/AdminIndex';
import ShoppingCart from '@/components/shop/shoppingcart/ShoppingCart';
import PersonalInfomation from '@/components/shop/personalinfomation/PersonalInfomation';
import LoginPage from '@/components/LoginPage'


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
            name: 'Testaa',
            path: '/testaa',
            component: Testaa
        },
        {
            name: 'Testaaa',
            path: '/testaaa',
            component: Testaaa
        },
        {
            name: 'Testaaaa',
            path: '/testaaaa',
            component: Testaaaa
        },
        {
            name: 'PersonalInfomation',
            path: '/infomation',
            component: PersonalInfomation
        },
        {
            name: 'LoginPage',
            path: '/loginandregisiter',
            component: LoginPage
        },
    ]

})