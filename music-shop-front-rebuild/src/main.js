import Vue from 'vue'
import App from './App.vue'

import router from './router';



// font-awesome
import "font-awesome/css/font-awesome.min.css"

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);

import lodash from 'lodash';
Vue.prototype.lodash = lodash;

Vue.config.productionTip = false

new Vue({
    render: h => h(App),
    router
}).$mount('#app')