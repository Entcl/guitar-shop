<template>

    <!-- HEADER -->
    <div style="margin-bottom: 20px;">

        <!-- userbtn -->
        <div class="back" style="width: 100%;height:100px;">
            <!-- userinfo -->
            <div class="userbtn" style="float:left;">
                <div class="shoppingcrat" style="float:left;">
                    <i class="el-icon-shopping-cart-full"></i>
                    <router-link to="/shoppingcart">购物车({{ num }})</router-link>
                </div>
                <div class="el-icon-user">
                    <router-link to="/infomation">个人信息</router-link>
                </div>
                <i class="el-icon-monitor">
                    <!-- <div class="account-operate">
                        <div class="login">
                            <router-link to="/" style="color: #000;">
                                <div id="login-btn">
                                    <i class="el-icon-user"></i>
                                    登录
                                </div>
                            </router-link>
                        </div>
                    </div> -->
                </i>
                &nbsp;&nbsp;&nbsp;&nbsp;<span>欢迎您，{{ UserName }}</span>
            </div>
            <!-- shopinfo -->
            <div class="shopinfo" style="">
                <ul>
                    <li>
                        <router-link to="/">
                            首页
                        </router-link>
                    </li>
                    <li>
                        <router-link to="/">
                            所有产品
                            <div class="allproduct" style="position:absolute;">
                                <ul style="float:left">
                                    <li>古典吉他</li>
                                    <li>电吉他</li>
                                    <li>木吉他</li>
                                    <li>贝斯</li>
                                    <li>尤克里里</li>
                                </ul>





                            </div>
                        </router-link>
                    </li>
                    <li><a href="javascript:alert(3);">活动专区</a></li>
                    <li>
                        <el-button :plain="true" @click="about" class="btn">关于品牌</el-button>
                    </li>
                    <li>
                        <el-button :plain="true" @click="about" class="btn">代言人</el-button>
                    </li>
                </ul>
            </div>
        </div>
        <!-- search-btn -->
        <div class="search-btn">
            <el-input placeholder="输入型号/厂商" v-model="value">
                <i class="el-icon-search el-input__icon" slot="suffix">
                </i>
            </el-input>
            免责声明：本网站仅用作学习使用，非用作商业用途，图片素材均来源于网络，侵权请联系作者1273505772@qq.com删除
        </div>
        <!-- logo -->
        <div class="logo" style="float:left;display: flex;">
            <div class="logo" style="margin-left:-350%;">
                <div id="corpTitle" class="corpTitle corpTitle2" fontpatterntitle="false"
                    style="top: 45px; left: 0px; cursor: pointer; min-height: 40px; min-width: 160px;">
                    <a href="javascript:;" style="text-decoration:none;">
                        <h1 class="titleWrapper">
                            <span style="">
                                <router-link to="/" style="text-decoration: none;">
                                    <div style="color: rgb(34, 34, 34);" class="newPrimaryTitle">
                                        <span style="font-family: fontface__思源黑体Medium__18__1590937157354;">
                                            <span style="color: #3f403f;">
                                                音乐
                                            </span>
                                            <span style="color: #2462af;">
                                                商城
                                            </span>
                                        </span>
                                    </div>
                                </router-link>
                            </span>
                        </h1>
                    </a>
                </div>
            </div>
        </div>

        <div style="border-bottom: 1px solid #eee;height: 80px;margin-top: 10px;"></div>

    </div>



</template>

<script>
export default {
    name: 'ShopHeader',
    data() {
        return {
            UserName: "this.$route.params.UserName",
            num: 0,
            value: "",
        }
    },
    methods: {
        about() {
            this.$message('并没有');
        },
    }
}
</script>

<style scoped>
::v-deep .el-input__inner {
    border-radius: 23px;
}

.search-btn {
    width: 339px;
    height: 38px;
    margin: 0 auto;
    margin-top: -65px;
}

.userbtn {
    font-size: 18px;
    /* background-color: #bbb; */
    line-height: 100px;
    margin-left: 1%;
    padding-left: 4%;
}


.userbtn>div {
    margin-right: 23px;
}

.userbtn div>a {
    text-decoration: none;
    color: #999;
}

.userbtn div>a:hover {
    color: #fc3d1b;
}


.logo {
    margin-top: 1%;
}

.shopinfo {
    float: right;
    margin-right: 7%;
}

.shopinfo>ul {
    list-style: none;
    line-height: 100px;
    margin-top: -3px;
}

.shopinfo>ul>li {
    float: left;
    text-decoration: none;
    font-size: 22px;
    margin-right: 30px;
}

.shopinfo>ul>li>a {
    text-decoration: none;
    color: #888;
}

.shopinfo>ul>li>a:hover {
    color: #444;
}

::v-deep .shopinfo>ul>li>.btn {
    border: 0;
    color: #888;
    font-size: 22px;
}

::v-deep .shopinfo>ul>li>.btn:hover {
    color: #444;
}

.account-operate {
    display: none;
    color: #000;
    font-size: 18px;
    position: absolute;
    top: 70px;
    /* background-color: red; */
}

::v-deep #login-btn:hover {
    color: red;
}

.allproduct li {
    font-size: 13px;
    float: left;
    margin: -30px 30px;
    background-color: red;
}
</style>
