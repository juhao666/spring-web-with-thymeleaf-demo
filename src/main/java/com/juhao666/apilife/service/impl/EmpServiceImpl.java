package com.juhao666.apilife.service.impl;

import com.juhao666.apilife.mapper.EmpMapper;
import com.juhao666.apilife.model.Emp;
import com.juhao666.apilife.service.EmpService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper mapper;

    Counter counter;

    /**
     * 自定义metrics 监控某个endpoint调用次数
     * http://localhost:8080/actuator/metrics/empService.getEmp.count
     */
    public EmpServiceImpl(MeterRegistry registry) {
        counter = registry.counter("empService.getEmp.count");
    }

    public Emp getEmp(String id) {
        counter.increment();
        return mapper.getEmp(id);
    }
}
