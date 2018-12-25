package com.cqupt.weigs;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author weigs
 * @date 2018/7/29 0029
 */
@RestController
public class HelloController {
    @Autowired
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMethod")
    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String hello() {
        return restTemplate.getForEntity("http://SERVICE-HI/hello",
            String.class).getBody();
    }

    public String errorMethod() {
        return "sorry, error";
    }
}

