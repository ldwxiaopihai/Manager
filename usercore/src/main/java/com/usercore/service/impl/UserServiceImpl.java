package com.usercore.service.impl;

import com.usercore.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/8 0008.
 */
@Service
public class UserServiceImpl {
    @Autowired
 private UserMapper userMapper;

    public String dome (String UserName)throws Exception{
        String name=userMapper.selectByUserName(UserName);
        System.out.println(name);
        return name;
    }


}
