1.使用nacos作为服务注册和发现
2.使用nacos作为配置中心，配置主要是在provider模块体现
3.使用okhttp还没有成功
![Image text](https://github.com/lgg476864889/spring-cloud-demo/blob/main/provider/src/main/resources/%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83.png)
配置中心值：
server:
  port: 8092
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
        service: ${spring.application.name}
my: 配置中心取的值
