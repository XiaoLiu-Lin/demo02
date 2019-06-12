package com.example.demo.mapper;

import com.example.demo.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//用户信息表
public interface LoginMapper {
    /*
    * 根据userName查找用户信息
    * */
    @Select("SELECT * FROM test_login WHERE username=#{userName}")
    public List<Login> getLogin(@Param("userName") String userName);
}
