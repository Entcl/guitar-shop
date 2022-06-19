<template>
    <div>
        <div class="header" style="height: 70px;">
            <el-row>
                <!-- user-btn -->
                <el-col :span="8">

                    <div class="user-btn">
                        <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal"
                            @select="handleSelect">


                            <el-submenu index="1">
                                <template slot="title"><i class="el-icon-user"></i></template>
                                <router-link to="/loginandregisiter">
                                    <el-menu-item index="2-1">
                                        登录
                                    </el-menu-item>
                                </router-link>
                                <router-link to="/loginandregisiter">
                                    <el-menu-item index="2-2">
                                        注册
                                    </el-menu-item>
                                </router-link>
                            </el-submenu>

                            <el-menu-item index="2">
                                <router-link to="/infomation">
                                    个人信息
                                </router-link>
                            </el-menu-item>

                            <el-menu-item index="3"> <i class="el-icon-shopping-cart-full"></i>
                                <router-link to="/shoppingcart">购物车({{ num }})</router-link>
                            </el-menu-item>


                            <el-menu-item index="4">
                                <span>
                                    欢迎您，{{ UserName }}
                                </span>
                            </el-menu-item>
                        </el-menu>

                    </div>
                </el-col>

                <!-- search -->
                <el-col :span="8">
                    <div class="search">
                        <el-input placeholder="输入型号/厂商" v-model="value">
                            <i class="el-icon-search el-input__icon" slot="suffix">
                            </i>
                        </el-input>
                    </div>

                    <!-- logo -->
                    <div class="logo" style="">
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
                    </div>
                </el-col>



                <!-- web-btn -->
                <el-col :span="8">
                    <div class="web-btn">
                        <span class="el-dropdown-link" @click="about">
                            <router-link to="/">
                                代言人
                            </router-link>
                        </span>
                        <span class="el-dropdown-link" @click="about">
                            <router-link to="/">
                                关于品牌
                            </router-link>
                        </span>

                        <span class="el-dropdown-link">
                            <router-link to="/">
                                活动专区
                            </router-link>
                        </span>

                        <el-dropdown>
                            <span class="el-dropdown-link">
                                所有产品<i class="el-icon-arrow-down el-icon--right"></i>
                            </span>
                            <el-dropdown-menu slot="dropdown">
                                <el-dropdown-item>古典吉他</el-dropdown-item>
                                <el-dropdown-item>电吉他</el-dropdown-item>
                                <el-dropdown-item>贝斯</el-dropdown-item>
                                <el-dropdown-item>尤克里里</el-dropdown-item>
                                <el-dropdown-item divided>原声吉他</el-dropdown-item>
                            </el-dropdown-menu>
                        </el-dropdown>
                        <span class="el-dropdown-link">
                            <router-link to="/">
                                首页
                            </router-link>
                        </span>
                    </div>
                </el-col>
            </el-row>
        </div>

    </div>
</template>

<script>
export default {
    name: 'ShopHeader',
    data() {
        return {
            // UserName: "this.$route.params.UserName",
            UserName: "this.UserName",
            num: 0,
            value: "",
            activeIndex: '1',
            activeIndex2: '1'
        }
    },
    methods: {
        about() {
            this.$message({
                message: '什么都没有',
                center: true
            })
        },
        handleSelect(key, keyPath) {
            console.log(key, keyPath);
        }
    }
}
</script>

<style scoped>
.web-btn span,
.web-btn a,
.web-btn div {
    float: right;
    font-size: 18px;
    line-height: 100%;
    margin-top: 10px;
    margin-right: 30px;
    text-decoration: none;
}

.header {
    background-color: whitesmoke;
    width: 100%;
    position: fixed;
    z-index: 99;
}

.search {
    width: 250px;
    margin-left: 150px;
    margin-top: 15px;
    /* margin: 0 auto; */
}

.logo {
    position: relative;
    top: -38px;
    /* font-family: ; */
    font-size: 25px;
    left: 450px;

}

::v-deep .search>.el-input--suffix .el-input__inner {
    border-radius: 80px;
}

.user-btn span {
    font-size: 16px;
}
</style>
