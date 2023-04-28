package com.juhao666.apilife.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 自动逸Actuator endpoint
 * name: myComponent
 */
@Component
public class MyComponentHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, Object> map = new HashMap<>();
        if (1 == 1) {
            builder.up();
            map.put("code", 200);
        } else {
            builder.down();
            map.put("code", 500);
        }
        builder.withDetails(map);
    }
}
