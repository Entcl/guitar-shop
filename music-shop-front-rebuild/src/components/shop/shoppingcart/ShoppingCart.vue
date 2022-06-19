<template>
    <div>
        <el-page-header @back="goBack" content="详情页面">
        </el-page-header>

        <el-table ref="multipleTable" :data="tableData" tooltip-effect="dark" style="width: 100%"
            :row-class-name="tableRowClassName" @selection-change="handleSelectionChange">

            <!-- checkbox -->
            <el-table-column type="selection" width="50">
            </el-table-column>

            <!-- img -->
            <el-table-column label="全选" width="120">
                <template slot-scope="scope">{{ scope.row.date }}</template>
            </el-table-column>

            <!-- 商品信息 -->
            <el-table-column prop="name" label="商品信息" width="240">
            </el-table-column>

            <!-- 单价 -->
            <el-table-column prop="shopPrice" label="单价" width="120">
            </el-table-column>

            <!-- 数量 -->
            <el-table-column prop="address" label="数量" show-overflow-tooltip width="220">
                <template slot-scope="scope">
                    <el-input-number v-model="tableData[scope.$index].shopNumber"
                        @change="handleChange(tableData[scope.$index].shopPrice, tableData[scope.$index].shopNumber)"
                        :min="1" :max="10" label="描述文字">
                    </el-input-number>
                </template>
            </el-table-column>

            <!-- 小计 -->
            <el-table-column prop="shopPrice" label="小计" width="120">
                <template slot-scope="scope">
                    ￥{{ totalPrice[scope.$index] }}
                </template>
            </el-table-column>

            <!-- 操作 -->
            <el-table-column label="操作" width="120">
                <template slot-scope="scope">
                    <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>

        </el-table>


        <div style="margin-top: 20px">
            总价：￥{{ countAllPrice }}
            <!-- <el-button @click="toggleSelection([tableData[1]])">切换第二、第三行的选中状态</el-button> -->
            <el-popconfirm title="确认购买吗？" icon="el-icon-loading" @confirm="buy">
                <el-button slot="reference">购买</el-button>
            </el-popconfirm>

            <el-popconfirm title="确认清空吗？" icon="el-icon-loading" @confirm="clearShop">
                <el-button slot="reference" type="warning" plain>清空购物车</el-button>
            </el-popconfirm>
            <el-button @click="testaaa">test</el-button>
        </div>

    </div>
</template>

<script>
import router from '@/router';
export default {
    name: 'shoppingCart',
    data() {
        return {
            deep: true,
            allcheck: false,
            tableData: [{
                date: 'picurl1',
                name: 'shopname1',
                address: '上海市普陀区金沙江路 1518 弄',
                shopPrice: 10,
                shopNumber: 1
            },
            {
                date: 'picurl2',
                name: 'shopname2',
                address: '上海市普陀区金沙江路 1518 弄',
                shopPrice: 20,
                shopNumber: 2
            },
            {
                date: 'picurl3',
                name: 'shopname3',
                address: '上海市普陀区金沙江路 1518 弄',
                shopPrice: 30,
                shopNumber: 3
            },
            {
                date: 'picurl4',
                name: 'shopname4',
                address: '上海市普陀区金沙江路 1518 弄',
                shopPrice: 40,
                shopNumber: 4
            },
            ],
            multipleSelection: []
        }
    },
    methods: {
        // css
        tableRowClassName({ row, rowIndex }) {
            if (rowIndex === 1) {
                return 'warning-row';
            } else if (rowIndex === 3) {
                return 'success-row';
            }
            return '';
        },

        // handleEdit(index, row) {
        //     console.log(index, row);
        // },

        // 删除按钮
        handleDelete(index, row) {
            // let length = console.log(this.tableData.length);
            // console.log(row);
            // console.log(index);
            this.tableData.splice(index,1);
        },

        // console.log("单价：" + shopPrice, "数量：" + shopNumber);
        // console.log("小计：" + shopPrice * shopNumber);
        handleChange(shopPrice, shopNumber) {
            return shopPrice * shopNumber;
        },

        // goback
        goBack() {
            console.log('go back');
            router.push('/')
        },
        testaaa() {
            console.log(this.multipleSelection);
        },
        // 切换选择状态
        toggleSelection(rows) {
            console.log(rows);
            console.log(this.multipleSelection);
            if (rows) {
                rows.forEach(row => {
                    this.$refs.multipleTable.toggleRowSelection(row);
                });
            } else {
                this.$refs.multipleTable.clearSelection();
            }
        },
        handleSelectionChange(val) {
            this.multipleSelection = val;
        },

        // axios
        buy() {
            console.log("购买对象", this.multipleSelection, "总价：" + this.countAllPrice);
        },
        clearShop() {
            let length = console.log(this.tableData.length);
            this.tableData.splice(length);
            console.log("清空购物车");
        },
    },
    computed: {

        // 当前行价格
        totalPrice() {
            // console.log(this.tableData);
            let tableData = this.tableData;

            let tableDataTotalPrice = [];
            for (let index = 0; index < tableData.length; index++) {
                tableDataTotalPrice.push(tableData[index].shopPrice * tableData[index].shopNumber);
            }
            // console.log(shoppingcartTotalPrice);
            return tableDataTotalPrice;
        },

        // 总价
        countAllPrice: {
            set() { },
            get() {

                let multipleSelection = [];
                multipleSelection = this.multipleSelection;
                let countAllPrice = 0;
                for (let index = 0; index < multipleSelection.length; index++) {
                    countAllPrice += multipleSelection[index].shopPrice * multipleSelection[index].shopNumber;
                }
                return countAllPrice;
            }
        },
    }
}
</script>

<style scoped>
::v-deep .el-table .warning-row {
    background: oldlace;
}

::v-deep .el-table .success-row {
    background: #f0f9eb;
}
</style>