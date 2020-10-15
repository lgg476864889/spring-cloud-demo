package org.example.consumer.fallback;

import org.example.consumer.feign.ProviderClient;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Ye Hongzhi 公众号：java技术爱好者
 * @name ProviderClientFallBack
 * @date 2020-10-12 22:54
 **/
@Component
public class ProviderClientFallBack implements ProviderClient {
    @Override
    public String sayHello(String name) {
        return "sayhello 调用超时";
    }

    @Override
    public String list() {
        return Arrays.asList("调用fallBack接口", "返回未知结果").toString();
    }

    @Override
    public String loadBalancer() {
        return "调用服务超时！请稍后再试！";
    }
}
