<template>
    <div>
        <div style="top:25px;position: relative;">
            <el-row :gutter="20">
                <el-col :span="6" :offset="3">
                    <div class="daiyanren">
                        <strong>
                            代言人(移动鼠标至图片)
                        </strong>
                    </div>
                </el-col>
                <el-col :span="6" :offset="3">
                    <div class="zhuanji">
                        <strong>
                            专辑及其他音乐产品
                        </strong>
                    </div>
                </el-col>
            </el-row>

            <el-row :gutter="20">
                <el-col :span="6" :offset="3">
                    <div @mouseenter="showIntroduce()" @click="about">
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
                        <router-link to="">
                            <img src="../../../../assets/img/shopindex.jpg" alt="冯羿"
                                style="width: 600px;height: 339px;">
                        </router-link>
                    </div>
                </el-col>
                <el-col :span="6" :offset="3">
                    <div class="zhuanji" @mouseenter="showIntroduce()" @click="about">
                        <router-link to="">
                            <img src="../../../../assets/img/bj01.png" alt="专辑">
                        </router-link>
                    </div>
                </el-col>

                <div class="icon-line-toout">
                    <el-col :span="6" :offset="12">
                        <div style="border:1px solid #eee;width: 524px;position: relative;top: 180px;">

                        </div>
                    </el-col>
                    <el-col :span="6" :offset="12">
                        <div class="icon-toout" @click="peach">
                            <ul style="list-style:none;float: left;">
                                <li>
                                    <router-link to="" @click="peach">
                                        <i class="fa fa-youtube-play"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <router-link to="" @click="about">
                                        <i class="fa fa-instagram"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <router-link to="" @click="about">
                                        <i class="el-icon-s-promotion"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <router-link to="" @click="about">
                                        <i class="fa fa-twitter" style="color:blueviolet"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <a href="https://www.apple.com.cn/safari/" target="_blank">
                                        <i class="fa fa-safari" style="color:red"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </el-col>
                </div>

            </el-row>

            <div style="height:10px;border-bottom:1px solid #eee">

            </div>
        </div>
    </div>
</template>

<script>

export default {
    name: 'Content',
    data() {
        return {
            show: false,
        }
    },
    methods: {
        showIntroduce() {
            this.show = true
        },
        about() {
            this.$message({
                message: '什么都没有',
                center: true
            })
        },
        peach() {
            this.$message({
                message: '过不去',
                center: true,
                type: 'warning'
            })
        },
    }
}
</script>

<style scoped>
.daiyanren,
.zhuanji {
    height: 60px;
    line-height: 60px;
    color: #000000;
    font-size: 18px;
}

.introduce {
    position: absolute;
    left: 350px;
    top: 70px;
    color: #fff;
    font-size: 23px;
}

.icon-toout ul li {
    position: relative;
    float: left;
    margin: 20px 30px;
    top: 200px;
    left: 30px;
}

::v-deep .icon-toout i {
    font-size: 33px;
}

.icon-toout i:hover {
    color: red;
}

.icon-line-toout {
    position: relative;
    top: -260px;
}

.icon-toout a {
    color: #000;
}
</style>