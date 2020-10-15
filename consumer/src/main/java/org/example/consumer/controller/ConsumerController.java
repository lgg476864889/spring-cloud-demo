package org.example.consumer.controller;

import org.example.consumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author lggui1
 * @Date 2020/10/14
 * @Description
 **/
@RestController
public class ConsumerController {
    @Resource
    private ProviderClient providerClient;

    @RequestMapping(value = "/consumer/callProvider", method = RequestMethod.GET)
    public String callProvider() throws Exception {
        long star = System.currentTimeMillis();
        String list = providerClient.list();
        long end = System.currentTimeMillis();
        return "响应结果：" + list + ",耗时：" + (end - star) / 1000 + "秒";
    }

    @RequestMapping(value = "/consumer/callLoadBalancer" , method = RequestMethod.GET)
    public String callLoadBalancer() throws Exception {
        return providerClient.loadBalancer();
    }
    @RequestMapping(value = "/consumer/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name")String name) throws Exception {
        return providerClient.sayHello(name);
    }
}
