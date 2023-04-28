package com.juhao666.apilife.mapper;

import com.juhao666.apilife.model.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
    public Emp getEmp(String id);
}
