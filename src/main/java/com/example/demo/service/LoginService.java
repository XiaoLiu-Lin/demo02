package com.example.demo.service;

import com.example.demo.entity.Login;
import com.example.demo.service.ex.TestException;
import com.example.demo.service.ex.UserNameException;

public interface LoginService {

    /*
     * 根据userName查找用户信息
     * */
    public Login getLogin(String userName, String password) throws TestException;


    /*
    * 用户注册
    * */
    void  addUser2(Login login) throws UserNameException;

}
