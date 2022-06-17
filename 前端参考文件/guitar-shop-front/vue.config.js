const { defineConfig } = require('@vue/cli-service')

module.exports = defineConfig({
    transpileDependencies: true,
    // 驼峰
    lintOnSave: false,
    /* 输出文件目录：在npm run build时，生成文件的目录名称 */
    publicPath: "./",
    devServer: {
        open: true, //是否自动打开浏览器
        https: false, //是否开启https
        hotOnly: false,
        proxy: { // 配置跨域
            '/api': {
                target: 'http://127.0.0.1:9090/', //请求接口域名 
                ws: true,
                secure: false,
                changOrigin: true, //是否允许跨越
                pathRewrite: {
                    '^/api': ''
                }
            }
        },
        before: app => {}
    }

})