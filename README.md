# Spring-Boot-Sharding-JDBC
 
# Nginx 配置
~~~
location /Spring-Boot-Sharding-JDBC/ {
    proxy_set_header        Host                $host;
    proxy_pass                                  http://localhost:8321/Spring-Boot-Sharding-JDBC/;

    proxy_set_header        X-Real-IP           $remote_addr;
    proxy_set_header        X-Forwarded-For     $proxy_add_x_forwarded_for;
    proxy_http_version                          1.1;
    proxy_set_header        Upgrade             $http_upgrade;
    proxy_set_header        Connection          'upgrade';
}
~~~

# [Sharding-UI 部署运行](https://shardingsphere.apache.org/document/current/cn/manual/sharding-ui/usage/build/)

## 二进制运行
### [下载页面](https://github.com/apache/shardingsphere/releases)

### 打包命令
~~~
mvn clean install -Prelease
~~~

### 安装包位置
~~~
/sharding-distribution/shardingsphere-ui-distribution/target/apache-shardingsphere-${latest.release.version}-sharding-ui-bin.tar.gz；
~~~

### 解压缩后运行
~~~
bin/start.sh
~~~

### [访问](http://localhost:8088/)

## 前端
- 进入 sharding-ui-frontend/ 目录
- 执行 npm install
- 执行 npm run dev
- 访问 http://localhost:8080/

## 配置

## Sharding-UI 配置文件
- conf/application.properties
    - 程序监听端口
    - 登录身份验证信息
~~~
server.port=8088

user.admin.username=admin
user.admin.password=admin
~~~

## [下载页面](https://shardingsphere.apache.org/document/current/cn/downloads/)

## [全版本](https://archive.apache.org/dist/incubator/shardingsphere/)
