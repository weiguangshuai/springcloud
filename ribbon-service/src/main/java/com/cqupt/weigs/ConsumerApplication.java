package com.cqupt.weigs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author weigs
 * @date 2018/7/29 0029
 */
@SpringBootApplication
@EnableEurekaClient
//向服务中心注册
@EnableDiscoveryClient
@EnableHystrix
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
//该注解表明restTemplate开启负载均衡功能
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
