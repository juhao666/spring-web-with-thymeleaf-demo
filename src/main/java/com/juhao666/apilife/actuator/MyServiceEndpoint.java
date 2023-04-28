package com.juhao666.apilife.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
@Endpoint(id = "myService")
public class MyServiceEndpoint {

    @ReadOperation
    public Map get() {
        return Collections.singletonMap("status", "UP");
    }

    @WriteOperation
    public void stop() {
        System.out.println("will stop the service 2 minutes later...");
    }
}
