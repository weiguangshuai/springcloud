package com.cqupt.weigs.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author weigs
 * @date 2018/8/5 0005
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String sayHiFromOneClient();
}
