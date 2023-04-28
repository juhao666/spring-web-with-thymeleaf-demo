package com.juhao666.apilife.model;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("emp")
public class Emp {
    @TableField(exist = false)
    private String uuid;

    private String id;
    private String username;
    private String position;
    private int age;
    private Date onboardDate;
}
