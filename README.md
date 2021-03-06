# ipfs-cloud

> 基于SpringCloud的IPFS私有云,主要解决文件存储分发问题,不考虑挖矿
* 内网快速搭建私有文件存储服务，能快速部署、快速访问、无限扩容、自动分发、自动备份

## 愿景
基于系统软连接形式来管理这些文件，上传文件后，生成真实名的软连接，软连接到ipfs的唯一key值，名字为'.'+key形式；这样用户看起来还是传统文件
，当要查看文件时，从ipfs私有网络下载下来即可，下载的文件名以'.'+key+'.ipfs'存储在本地；这样同一台服务器，已下载过的文件，不需要再次从ipfs
网络重新获取；当服务器资源不足时，可快速清理掉缓存文；当有同名文件上传覆盖时，把原有的软连接名备份为'.'+key+'.'+'系统时间戳'，这样方便查找历史记录。

## 搜索和加密
默认单机搜索，可插拔类似ES的专业化搜索组件，能快速分布式部署。文件加密问题，可全局控制是否启用加密，如果文件加密，把秘钥存在软连接名的key后面，用':'
隔开，如'.'+key+':'+'password',password为用户自定义的秘钥内容，可自定义password的加密方式。