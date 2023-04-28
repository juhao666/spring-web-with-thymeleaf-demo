package com.juhao666.apilife.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.juhao666.apilife.mapper.UserMapper;
import com.juhao666.apilife.model.Emp;
import com.juhao666.apilife.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Emp> implements UserService {
}
