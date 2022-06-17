<template>
    <div>
        <input type="button" value="提交" @click="axiosaaa()">
    </div>
</template>

<script>
import axios from '@/utils/axios.js';

export default {
    name: "Test",
    data() {
        return {
            obj: [{
                name: "asd",
                sex: ""
            }]
        }
    },
    methods: {
        axiosaaa: function (api, params) {
            axios.post("user2");
        }
    }
}
</script>

<style>
</style>