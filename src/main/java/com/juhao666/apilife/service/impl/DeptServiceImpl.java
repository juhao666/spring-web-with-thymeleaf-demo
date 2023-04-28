package com.juhao666.apilife.service.impl;

import com.juhao666.apilife.mapper.DeptMapper;
import com.juhao666.apilife.model.Dept;
import com.juhao666.apilife.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper mapper;


    public Dept getDept(int id) {
        return mapper.getDept(id);
    }

    public void save(Dept dept) {
        mapper.insert(dept);
    }
}
