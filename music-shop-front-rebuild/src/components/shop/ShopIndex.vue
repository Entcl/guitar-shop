<template>
    <div>
        <ShopHeader></ShopHeader>
        <Carousel></Carousel>
        <Content></Content>
        <Footer></Footer>
    </div>
</template>

<script>
import ShopHeader from './index/header/ShopHeader';
import Carousel from './index/main/Carousel.vue';
import Content from './index/main/Content.vue';
import Footer from './index/fotter/Footer.vue';

export default {
    name: 'ShopIndex',
    components: {
        ShopHeader,
        Carousel,
        Content,
        Footer
    },
}
</script>

<style>
@import '../../assets/css/base.css';
</style>
