package com.hlh.springboot.controller;

import com.hlh.springboot.entity.userList;
import com.hlh.springboot.mapper.DepartmentMapper;
import com.hlh.springboot.mapper.userListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dept {

    /*@Autowired
    DepartmentMapper departmentMapper;*/

    @Autowired
    userListMapper userListMapper;


    /*@GetMapping("/dept/{userId}")
    public userList getDeptById(@PathVariable("userId") Integer userId) {
        return departmentMapper.getDeptById(userId);
    }

    @GetMapping("/dept")
    public userList insertDept(userList userList){
        departmentMapper.insertDept(userList);
        return userList;
    }*/
    @GetMapping("/dept/{userId}")
    public userList getId(@PathVariable("userId") Integer userId){
        return userListMapper.getUserById(userId);
    }
}

