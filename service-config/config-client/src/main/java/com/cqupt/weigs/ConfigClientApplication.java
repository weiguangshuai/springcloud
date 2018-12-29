package com.cqupt.weigs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b><code>ConfigClientApplication</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/24 14:13.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableConfigurationProperties
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
