package com.lijian.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author lijian
 * @description
 * @date 2020/3/25
 *
 */
@Component
public class SchedualServiceHiHystric implements HelloService{

    //熔断
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
