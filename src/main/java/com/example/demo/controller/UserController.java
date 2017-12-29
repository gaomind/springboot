package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${MIND-ZR} on 2017/12/29.
 */

@RestController

public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "cs")
    public User cs(){
        User user=userMapper.selectUserById(1);
        System.out.println(user);
        return user;
    }
    @RequestMapping(value = "hello")
    public String a(){
        return "这是一个springboot的demo~";
    }
    @RequestMapping(value = "cs/{id}")
    public User cs1(@PathVariable("id") int id){
        User user=userMapper.selectUserById(id);

        return user;
    }
}
