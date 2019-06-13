package com.example.demo.service;

import com.example.demo.entity.Login;
import com.example.demo.service.ex.TestException;

import java.util.List;

public interface LoginService {

    /*
     * 根据userName查找用户信息
     * */
    public Login getLogin(String userName, String password) throws TestException;
}
