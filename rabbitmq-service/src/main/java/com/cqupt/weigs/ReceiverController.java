package com.cqupt.weigs;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

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
@RabbitListener(queues = "hello")
public class ReceiverController {


    //    @RequestMapping(value = "/receiver", method = RequestMethod.GET)
    @RabbitHandler
    public void process(String hello) {
        System.out.println(hello);
    }
}
