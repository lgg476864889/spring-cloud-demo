package org.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author lggui1
 * @Date 2020/10/14
 * @Description  给提供者继承
 **/
public interface DemoApi {
    @RequestMapping(value = "/provider/hello/{name}",method = RequestMethod.GET)
    String sayHello(@PathVariable(value="name") String name);

    @RequestMapping("/provider/list")
    String list();

    @RequestMapping("/provider/loadBalancer")
    String loadBalancer();
}
