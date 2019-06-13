package com.example.demo.service.impl;

import com.example.demo.entity.Login;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import com.example.demo.service.ex.TestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login getLogin(String userName, String password) throws TestException {
          Login list = loginMapper.getLogin(userName);
//        将拿到的userName与数据库的userName进行对比
        if (list == null) {
//         抛出异常，用户不存在；
            throw new TestException("登录失败，用户名不存在！");
        }
        if (list.getPassword().equals(password)) {
//      登录成功
            list.setPassword(null);
            return list;
        }else {
            throw new TestException("登录失败,密码失败!");
        }
    }
}
