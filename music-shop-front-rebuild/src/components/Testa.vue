<template>
    <div>
        <div class="box">
            <div class="title">
                <label><input type="checkbox" v-model="status">全选</label>
            </div>
            <ul>
                <li v-for="item, index of list"><label>
                        <input type="checkbox" v-model="item.checked">{{ item.title }}</label>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>

export default {
    name: "Testa",
    data() {
        return {
            list: [{
                title: '数据一',
                checked: false,
            }, {
                title: '数据二',
                checked: true,
            }, {
                title: '数据三',
                checked: true,
            }, {
                title: '数据四',
                checked: true,
            }, {
                title: '数据五',
                checked: true,
            }],
        }
    },
    computed: {
        status: {
            get() {
                return this.list.filter(item => item.checked).length === this.list.length
            },
            set(value) {
                this.list.map(function (item) {
                    item.checked = value;
                    return item;
                });
            }
        }
    }
}
</script>

<style>
</style>