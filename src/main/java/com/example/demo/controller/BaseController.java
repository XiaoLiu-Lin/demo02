package com.example.demo.controller;

import com.example.demo.entity.util.PesponseResult;
import com.example.demo.service.ex.TestException;
import com.example.demo.service.ex.UserNameException;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

    public static final Integer SUCCESS = 200;

    @ExceptionHandler({TestException.class,
            FileUploadException.class})
    public PesponseResult<Void>
    handleException(Exception e) {
        // 声明返回对象
        PesponseResult<Void> rr = new PesponseResult<Void>();
        // 在返回对象封装错误提示的文字
        rr.setMessage(e.getMessage());
// 根据异常的不同，返回的错误代码也不同
        if (e instanceof TestException) {
            // 400-用户名冲突
            rr.setState(400);
        }else if (e instanceof UserNameException) {
            //401-用户注册异常
            rr.setState(401);
        }
        return rr;
    }
}
