package com.cqupt.weigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * <b><code>Sender</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/31 0:15.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */
@RestController
public class SenderController {

    private final static Logger log = LoggerFactory.getLogger(SenderController.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send() {
        String context = "hello " + new Date();
        log.info("Sender: " + context);
        amqpTemplate.convertAndSend("hello", context);
        return "success";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return restTemplate.getForObject("http://localhost:3333/hello", String.class);
    }
}
