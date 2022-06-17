<template>
    <div>
        {{ footerMsgCopyright }}
        <span class="source">{{ footerMsgName }}</span>
    </div>
</template>

<script>
export default {
    name: "Footer",
    data() {
        return {
            // 版权说明的文字
            footerMsgCopyright: 'Copyright © 2020-2021 xxxx平台 - Powered By ',
            // 单位
            footerMsgName: 'phj'
        }
    },

}
</script>

<style scoped>
.app-foot {
    /* footer 固定在页面底部 */
    min-height: 35px;
    background-color: #eeeeee;
    width: 100%;
    font-size: 14px;
    display: flex;
    align-items: center;
    justify-content: center;
}

.source {
    font-weight: 600;
}
</style>