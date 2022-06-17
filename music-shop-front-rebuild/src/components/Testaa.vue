<template>
    <div>
        <el-checkbox :indeterminate="isIndeterminate" v-model="checkAll" @change="handleCheckAllChange">全选</el-checkbox>
        <el-checkbox-group v-model="check" @change="handleCheckedCitiesChange">
            <el-row>
                <el-col :span="12" v-for="item in checkedList" :key="item.id" style="padding:30px">
                    <el-checkbox :label="item.id">
                        <span style="margin:0 120px 0 40px">{{ item.name }}</span>
                        <span>{{ item.phone }}</span>
                    </el-checkbox>
                </el-col>
            </el-row>
        </el-checkbox-group>
    </div>

</template>

<script>
export default {
    name: "Testaa",
    data() {
        return {
            isIndeterminate: false,
            checkAll: false,
            check: [],
            checkedGameId: [],
            checkedList: [
                {
                    id: 1,
                    name: "张三",
                    phone: "13554006475"
                },
                {
                    id: 2,
                    name: "李四",
                    phone: "13514002475"
                },
                {
                    id: 3,
                    name: "王五",
                    phone: "13558992475"
                }
            ]
        };
    },
    methods: {
        init() {
            for (let i = 0; i < this.checkedList.length; i++) {
                this.checkedGameId.push(this.checkedList[i].id);
            }
        },
        handleCheckAllChange(val) {
            console.log(123);
            this.check = val ? this.checkedGameId : [];
            this.isIndeterminate = false;
        },
        handleCheckedCitiesChange(value) {
            let checkedCount = value.length;
            this.checkAll = checkedCount === this.checkedList.length;
            this.isIndeterminate =
                checkedCount > 0 && checkedCount < this.checkedList.length;
        }
    },
    created() {
        this.init();
    }

}
</script>

<style scoped>
</style>