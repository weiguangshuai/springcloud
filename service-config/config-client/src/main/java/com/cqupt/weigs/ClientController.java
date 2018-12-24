package com.cqupt.weigs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b><code>ClientController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/24 14:42.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */
@RestController
public class ClientController {
    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String config() {
        return foo;
    }
}