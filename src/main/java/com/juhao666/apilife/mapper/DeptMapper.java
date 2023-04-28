package com.juhao666.apilife.mapper;

import com.juhao666.apilife.model.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeptMapper {

    @Select("select * from dept where id=#{id}")
    public Dept getDept(int id);


    @Insert("insert into dept(name) values(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insert(Dept dept);
}
