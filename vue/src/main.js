import Vue from 'vue';
import App from './App.vue';
import store from './store';
import Vuex from 'vuex';
import vuetify from './plugins/vuetify';

Vue.use(Vuex);

Vue.config.productionTip = false;

new Vue({
    store,
    vuetify,
    render: (h) => h(App),
}).$mount('#app');
