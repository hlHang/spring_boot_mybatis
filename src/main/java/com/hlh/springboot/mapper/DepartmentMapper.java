package com.hlh.springboot.mapper;

import com.hlh.springboot.entity.userList;
import org.apache.ibatis.annotations.*;

// @Mapper
public interface DepartmentMapper {

   /* @Select("SELECT * FROM user_list WHERE userId=#{userId}")
    public userList getDeptById(Integer id);

    @Delete("delete from user_list where userId=#{userId}")
    public int deleteById();

    @Options(useGeneratedKeys = true, keyProperty = "userId")

    @Insert("insert into user_list(userName) values(#{userName})")
    public int insertDept(userList userList);

    @Update("update user_list set userName=#{userName}  where userId=#{userId}")
    public int updateDept(userList userList);*/
}
