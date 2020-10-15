1.使用nacos作为服务注册和发现
2.使用nacos作为配置中心，配置主要是在provider模块体现
3.使用okhttp还没有成功

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