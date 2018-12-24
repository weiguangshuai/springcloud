package com.cqupt.weigs.feign;

import org.springframework.stereotype.Component;

/**
 * <b><code>SchedualServiceHiHystric</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/24 10:48.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromOneClient() {
        return "sorry, home";
    }

    @Override
    public String sayHello() {
        return "sorry, hello";
    }
}
