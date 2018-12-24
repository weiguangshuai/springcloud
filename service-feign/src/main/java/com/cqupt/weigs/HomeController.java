package com.cqupt.weigs;

import com.cqupt.weigs.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weigs
 * @date 2018/8/5 0005
 */
@RestController
public class HomeController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/home")
    public String home() {
        return schedualServiceHi.sayHiFromOneClient();
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return schedualServiceHi.sayHello();
    }
}
