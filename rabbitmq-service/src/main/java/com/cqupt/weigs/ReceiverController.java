package com.cqupt.weigs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * <b><code>Receiver</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/31 0:23.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */
//@RestController
@Component
@RabbitListener(queues = "hello")
public class ReceiverController {

    private final static Logger log = LoggerFactory.getLogger(ReceiverController.class);

    //    @RequestMapping(value = "/receiver", method = RequestMethod.GET)
    @RabbitHandler
    public void process(String message) {
//        log.info("receiver message : " + message);
        System.out.println("receiver message : " + message);
    }
}
