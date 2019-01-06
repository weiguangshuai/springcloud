package controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
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

    private final static Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello() throws InterruptedException {
        log.info("request from port: {}", port);
        Thread.sleep(100000);
        return "hello, I am from port: " + port;
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return restTemplate.getForObject("http://localhost:1118/send", String.class);
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ResponseEntity home() {
        User user = new User();
        user.setAge(22);
        user.setPassword("weigs");
        user.setUsername("weigs");
        return ResponseEntity.ok(user);
    }

    public String helloError() {
        return "sorry, error";
    }
}
