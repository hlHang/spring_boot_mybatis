package com.hlh.springboot.mapper;

import com.hlh.springboot.entity.userList;

// @Mapper 将接口扫描装配到到容器中
public interface userListMapper {

    public userList getUserById(Integer id);

    public void insertUser(userList userList);
}
