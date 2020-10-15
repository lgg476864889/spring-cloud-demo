package org.example.consumer.feign;

import org.example.DemoApi;
import org.example.consumer.fallback.ProviderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author lggui1
 * @Date 2020/10/14
 * @Description
 **/
@Component
@FeignClient(name = "provider",fallback = ProviderClientFallBack.class)
public interface ProviderClient  extends DemoApi {
}
