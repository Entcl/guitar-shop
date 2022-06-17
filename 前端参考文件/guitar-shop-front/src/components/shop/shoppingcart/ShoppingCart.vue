<template>
    <div>
        <el-page-header @back="goBack" content="购物车详情">
        </el-page-header>
        <div class="shoppingcart-main">
            <!-- 标题栏 -->
            <div class="shoppingcart-main-tit">
                <el-row>
                    <el-col :span="2">
                        <div class="grid-content bg-purple">
                            <el-checkbox v-model="allCheck">
                                全选
                            </el-checkbox>
                        </div>
                    </el-col>
                    <el-col :span="4">
                        <div class="grid-content bg-purple-light">
                            商品信息
                        </div>
                    </el-col>
                    <el-col :span="2">
                        <div class="grid-content bg-purple">
                            单价
                        </div>
                    </el-col>
                    <el-col :span="4">
                        <div class="grid-content bg-purple-light">
                            数量
                        </div>
                    </el-col>
                    <el-col :span="4">
                        <div class="grid-content bg-purple">
                            小计
                        </div>
                    </el-col>
                    <el-col :span="4">
                        <div class="grid-content bg-purple-light">
                            操作
                        </div>
                    </el-col>
                </el-row>
            </div>

            <!-- 内容 -->
            <div class="shoppingcart-main-content">
                <tbody style="Cellspacing:10px">
                    <tr v-for="(item, index) in shoppingcart">
                        <td :span="2">
                            <el-checkbox v-model="item.checkedval">
                            </el-checkbox>
                        </td>
                        <!-- 图片链接地址 -->
                        <td>
                            <div class="shop-img">
                                <img src="../../../assets/img/logo.png" :alt="item.alt">
                            </div>
                        </td>

                        <!-- 品牌商 -->
                        <td style="width:360px">
                            {{ item.info }}
                        </td>

                        <!-- 单价 -->
                        <td style="width:160px">
                            ￥{{ item.price }}
                        </td>
                        <!-- 数量 -->
                        <td style="width:370px">
                            <el-input-number v-model="item.number" @change="handleChange(item.price, item.number)"
                                :min="1" :max="10" label="件">
                            </el-input-number>
                        </td>
                        <!-- 栏目总价 -->
                        <td style="width:335px">
                            ￥{{ totalPrice[index] }}
                        </td>
                        <td style="width:375px">
                            <el-button type="danger" icon="el-icon-delete" circle @click="test(index)"></el-button>
                        </td>
                    </tr>
                </tbody>
            </div>

            <div style="height:1px;border-top:1px solid #663399;"></div>

            <!-- footer -->
            <div class="shoppingcart-main-footer">
                总价：￥{{ countAllPrice }}
                <el-button @click="buy()">购买</el-button>
                <el-button type="danger" @click="clearShoppingCart()">清空购物车</el-button>
            </div>

        </div>
    </div>
</template>

<script>
import router from '@/router';
export default {
    name: '',
    data() {
        return {
            deep: true,
            shoppingcart: [
                {
                    checkedval: true,
                    info: "品牌名",
                    price: 10,
                    number: 2,
                    alt: "123",
                },
                {
                    checkedval: true,
                    info: "品牌名2",
                    price: 20,
                    number: 4,
                    alt: "456",
                },
                {
                    checkedval: false,
                    info: "品牌名3",
                    price: 30,
                    number: 8,
                    alt: "789",
                },],

        }
    },
    methods: {
        test: function (index) {
            // alert(index);
            console.log(this.countAllPrice);
        },
        handleChange(price, number) {
            console.log("价格：" + price, "数量：" + number);
            return price * number;
        },
        buy(index) {
            let shoppingcart = this.shoppingcart;

            let obj = [];
            obj.push(this.countAllPrice);
            console.log(obj);

            for (let index = 0; index < shoppingcart.length; index++) {
                if (shoppingcart[index].checkedval === true) {
                    obj.push(shoppingcart[index]);
                }
            }

            console.log(obj);
        },
        clearShoppingCart: function () {
            // console.log(typeof this.shoppingcart);
            this.shoppingcart = []
            // console.log(typeof this.shoppingcart);
        },
        goBack() {
            console.log('go back');
            router.push('/')
        }
    },
    computed: {
        // 单价*数量
        totalPrice() {
            // console.log(this.shoppingcart);
            let shoppingcart = this.shoppingcart;

            let shoppingcartTotalPrice = [];
            for (let index = 0; index < shoppingcart.length; index++) {
                shoppingcartTotalPrice.push(shoppingcart[index].price * shoppingcart[index].number);
            }
            // console.log(shoppingcartTotalPrice);
            return shoppingcartTotalPrice;
        },
        // 总价
        countAllPrice: {
            set() { },
            get() {
                let shoppingcart = this.shoppingcart;
                let totalPrice = this.totalPrice;

                let shoppingcartCountAllPrice = 0;

                for (let index = 0; index < totalPrice.length; index++) {
                    if (shoppingcart[index].checkedval == true) {
                        shoppingcartCountAllPrice += totalPrice[index];
                    }
                }

                return shoppingcartCountAllPrice;
            }
        },
        // 全选
        allCheck: {
            get() {
                return this.shoppingcart.filter(item => item.checkedval).length === this.shoppingcart.length
            },
            set(value) {
                this.shoppingcart.map(function (item) {
                    item.checkedval = value;
                    return item;
                });
            }
        }
    }
}
</script>

<style scoped>
.shoppingcart-main-tit {
    border-top: 1px solid rebeccapurple;
    border-bottom: 1px solid rebeccapurple;
    text-align: center;
    margin-top: 1px;
    height: 40px;
    padding-top: 13px;

}

.shoppingcart-main-content {
    text-align: center;
}

.shoppingcart-main-content .shop-img>img {
    width: 100px;
    height: 100px;
    object-fit: contain;
    margin: 10px 30px;
}


.shoppingcart-main-content tr:nth-child(2n) {
    background-color: #f5f5f5;
}
</style>