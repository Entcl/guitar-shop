<template>
    <div>
        <div style="height:85px;"></div>
        <div style="color:#000000;font-size:20px;" class="daiyanren">
            <strong>
                代言人(移动鼠标至图片)
            </strong>
        </div>
        <!-- 冯羿 -->
        <div style="margin-top:30px;">
            <div class="shopindeximg" @mouseenter="showIntroduce()" @click="about">
                <router-link to="">
                    <transition name="el-fade-in-linear">
                        <div class="introduce" v-show="show">
                            <h2>
                                ENYA | 冯羿
                            </h2>
                            <h3>
                                E6 FE
                            </h3>
                        </div>
                    </transition>
                    <img src="../../../../assets/img/shopindex.jpg" alt="冯羿">
                </router-link>
            </div>
        </div>

        <!-- 专辑页面 -->
        <div class="zhuanji">
            <strong>
                专辑
            </strong>
        </div>
        <div style="" class="zhuanjiimg">
            <div style="right: 900px;border-bottom: 1px solid #eee;" @click="about">
                <router-link to="">
                    <img src="../../../../assets/img/bj01.png" alt="专辑">
                </router-link>
            </div>
            <div class="icon-toout" @click="about">
                <ul style="list-style:none;float: left;">
                    <li><i class="el-icon-phone-outline"></i></li>
                    <li><i class="el-icon-warning-outline"></i></li>
                    <li><i class="el-icon-s-promotion"></i></li>
                    <li><i class="el-icon-headset"></i></li>
                    <li><i class="el-icon-sugar"></i></li>
                </ul>
            </div>
        </div>

        <div style="height:10px;border-bottom:1px solid #eee">

        </div>
    </div>
</template>

<script>

export default {
    name: 'Content',
    data() {
        return {
            show: false,
            scrollTop: 0
        }
    },
    methods: {
        showIntroduce() {
            var c = window.scrollY;
            console.log(c);
            this.show = true
        },
        about() {
            this.$message({
                message: '什么都没有',
                center: true
            })
        },
    }
}
</script>

<style scoped>
tbody>:nth-child(1) {
    font-size: 16px;
    font-weight: bold;
    color: #cda25a;
    letter-spacing: 1px;
    line-height: 100%;
}

tbody>:nth-child(2) {
    left: 300px;
    float: left;
}

.shopindeximg {
    width: 600px;
    height: 339px;
}

.shopindeximg img {
    width: 600px;
    height: 339px;
    margin-left: 300px;
}

.introduce {
    z-index: 999;
    color: #fff;
    position: absolute;
    top: 850px;
    left: 380px;
    font-size: 27px;
}

.daiyanren {
    position: absolute;
    top: 755px;
    left: 320px;
}

.zhuanji {
    position: absolute;
    top: 760px;
    left: 1150px;
    color: #000;
    font-size: 20px;
    /* background-color: blue; */
}

.zhuanjiimg {
    position: absolute;
    top: 818px;
    left: 1150px;
    color: #000;
    font-size: 20px;
    /* background-color: blue; */
}

.icon-toout {
    position: relative;
    left: -50px;
}

.icon-toout li {
    float: left;
    margin: 20px 40px;
    font-size: 30px;
}

.icon-toout i:hover {
    color: red;
}
</style>