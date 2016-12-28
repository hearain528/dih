# dih

### 项目描述：由于solr官方的dataimport-schedular任务是不支持全量索引和增量索引时自定义要执行的核心core,所以本人将此做了升级优化

### 项目环境：
* tomcat8.5.9
* solr-6.3
* jdk-1.8

### 配置以及项目部署说明：
- 将conf文件夹下面的dataimport.properties文件复制到服务器solrhome的目录下面的conf文件夹下面即可
- 部署的时候要么在本地直接打成jar包替换官方的jar包，要么将直接编译的class文件放在solr的web目录下的WEB-INF下面即可（备注：这种方法要删除官方原来的jar包）
