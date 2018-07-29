package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weigs
 * @date 2018/7/29 0029
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello service2";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home2";
    }
}
