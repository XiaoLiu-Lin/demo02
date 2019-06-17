package com.example.demo.util;

import com.example.demo.entity.User;
import com.example.demo.util.ex.BizException;
import com.example.demo.utils.CExceptionEnums;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserRestController {

    @GetMapping("/users")

    public boolean insert(User user) {
        System.out.println("开始新增...");
        //如果姓名为空就手动抛出一个自定义的异常！
        if(user.getUserName()==null){
            throw new BizException(CExceptionEnums.SERVER_IMG_ERROR.getEcode(),"sss");
        }
        return true;
    }

    @PutMapping("/user")
    public boolean update(User user) {
        System.out.println("开始更新...");
        //这里故意造成一个空指针的异常，并且不进行处理
        String str=null;
        str.equals("111");
        return true;
    }

    @DeleteMapping("/user")
    public boolean delete(User user) {
        System.out.println("开始删除...");
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc123");
        return true;
    }

    @GetMapping("/user")
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        List<User> userList =new ArrayList<>();
        User user2=new User();
        user2.setId(1);
        user2.setUserName("xuwujing");
        user2.setPassword("123456");
        userList.add(user2);
        return userList;
    }

}
