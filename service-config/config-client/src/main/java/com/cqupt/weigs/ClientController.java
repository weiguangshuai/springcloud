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
 * <b>Creation Time:</b> 2018/12/24 18:05.
 *
 * @author weigs
 * @since spring-cloud-test 2.0.0
 */

@RestController
public class ClientController {

    @Value("${database.username}")
    private String foo;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String client() {
        return foo;
    }
}
