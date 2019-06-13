package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.entity.util.PesponseResult;
import com.example.demo.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginController extends BaseController{

    @Autowired
    private LoginService loginService;

    /*
     * 根据userName查找用户信息
     * */
    @GetMapping("/select")
    public PesponseResult<Login> getLogin(
            @Param("userName") String userName ,
            @Param("password") String password ,
            HttpSession session){
           Login login = loginService.getLogin(userName,password);
           session.setAttribute("id",login.getId());
           session.setAttribute("userName",login.getUserName());

            return new PesponseResult<Login>(SUCCESS,login);

    }
}