package com.cqupt.weigs;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * <b><code>RabbitMQConfig</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/31 0:25.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
