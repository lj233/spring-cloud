package com.lijian.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lijian
 * @description
 * @date 2020/3/25
 */
@FeignClient(value = "SERVICE-HI",fallback = SchedualServiceHiHystric.class)
public interface HelloService {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
