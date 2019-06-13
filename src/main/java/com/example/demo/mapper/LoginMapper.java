package com.example.demo.mapper;

import com.example.demo.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//用户信息表
public interface LoginMapper {


    /*
    *  用户登录
    *  @Param("userName") 用户账号信息
        根据userName查找用户信息对比账号是否注册如存此账号证明已注册
        则根据用户前台输入的密码与数据库密码进行对比
     * */
    @Select("SELECT * FROM test_login WHERE username=#{userName}")
    public Login getLogin(@Param("userName") String userName);



}
