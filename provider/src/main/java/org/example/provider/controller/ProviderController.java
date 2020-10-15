package org.example.provider.controller;

import org.example.DemoApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lggui1
 * @Date 2020/10/14
 * @Description
 **/
@RestController
@RefreshScope
public class ProviderController implements DemoApi {
    @Value("${server.port}")
    private String port;

    @Value("${my}")
    private String my;

    @Override
    public String sayHello(@PathVariable(value = "name") String name) {
        String s="hello,"+name+",配置中心值："+my;
        System.out.println(s);
        return s;
    }

    @Override
    public String list() {
        List<String> list = new ArrayList<>();
        list.add("java技术爱好者");
        list.add("SpringCloud");
        list.add("没有人比我更懂了");
        return list.toString();
    }

    @Override
    public String loadBalancer() {
        return "调用服务端口号为：" + port;
    }
}
