package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weigs
 * @date 2018/7/29 0029
 */
@RestController
public class HelloController {


    private final static Logger log = LoggerFactory.getLogger(HelloController.class);

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info("request from port: {}", port);
        return "hello, I am from port: " + port;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ResponseEntity home() {
        User user = new User();
        user.setAge(22);
        user.setPassword("weigs");
        user.setUsername("weigs");
        return ResponseEntity.ok(user);
    }
}
