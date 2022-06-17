<template>
    <div>
        {{ footerMsgCopyright }}
        <span class="source">{{ footerMsgName }}</span>
        {{ mess }}
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
            footerMsgName: '1273505772@qq.com',
            mess: "免责声明：本网站仅用作学习使用，非用作商业用途，图片素材均来源于网络，侵权请联系作者1273505772@qq.com删除"

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