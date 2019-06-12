package com.example.demo.service;

import com.example.demo.entity.Login;

import java.util.List;

public interface LoginService {

    /*
     * 根据userName查找用户信息
     * */
    public List<Login> getLogin(String userName);
}
