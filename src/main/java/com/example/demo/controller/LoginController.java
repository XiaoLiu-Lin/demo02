package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /*
     * 根据userName查找用户信息
     * */
    @GetMapping("/select")
    public List<Login> getLogin(@Param("userName") String userName){
        try {
            List<Login> login = loginService.getLogin(userName);
            return login;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
