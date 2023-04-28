package com.juhao666.apilife.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class DemoInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("appName", "api-fix")
                .withDetail("appVersion","1.0.0")
                .withDetails(Collections.singletonMap("maven",3));
    }
}
