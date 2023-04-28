package com.juhao666.apilife.service;

import com.juhao666.apilife.model.Dept;

public interface DeptService {
    public Dept getDept(int id);

    public void save(Dept dept);
}


