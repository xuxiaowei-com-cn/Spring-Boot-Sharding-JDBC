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