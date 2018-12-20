package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weigs
 * @date 2018/7/29 0029
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient(autoRegister = false)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
