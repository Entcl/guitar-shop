<template>
    <div>
        <div class="swiper">
            <div class="swiper-container" style="border-bottom:1px solid #eee">
                <div class="swiper-wrapper" style="margin-left:37%;">

                    <div class="swiper-slide"><img src="../../../../assets/img/home1.png" alt=""></div>
                    <div class="swiper-slide"><img src="../../../../assets/img/home2.png" alt=""></div>
                    <div class="swiper-slide"><img src="../../../../assets/img/home3.png" alt=""></div>
                    <div class="swiper-slide"><img src="../../../../assets/img/home4.jpg" alt=""></div>

                </div>
            </div>
        </div>
    </div>

</template>

<script>
// js
import Swiper from 'swiper';
// css
import 'swiper/css/swiper.min.css';

export default {
    name: 'Carousel',
    data() {
        return {

        }
    },
    mounted() {
        var mySwiper = new Swiper('.swiper-container', {
            // direction: 'vertical',
            loop: true,
            effect: 'coverflow',
            // autoplay: true,
            autoplay: {
                delay: 1000,
                stopOnLastSlide: false,
                disableOnInteraction: false,
            },
        })

        mySwiper.el.onmouseover = function () { //鼠标放上暂停轮播
            mySwiper.autoplay.stop();
        }
        mySwiper.el.onmouseleave = function () {
            mySwiper.autoplay.start();
        }

    },

}
</script>

<style scoped>
.swiper {
    margin-top: -1px;
}

.swiper-slide>img {
    width: 60%;
    /* height: 80%; */
}
</style>
