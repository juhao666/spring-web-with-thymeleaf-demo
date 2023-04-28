package com.juhao666.apilife.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
@AllArgsConstructor
@Deprecated
public class Employee {
    private String username;
    private String position;
    private int age;
    private Date onboardDate;
}
