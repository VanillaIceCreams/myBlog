package com.zxj.controller;

import com.zxj.pojo.User;
import com.zxj.service.UserService;
import com.zxj.utils.BlogResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/1/18.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PutMapping(value = "/authc/api/user/", produces = {"application/json;charset=UTF-8"})
    public BlogResult addUser(User user){
        return userService.addUser(user);
    }
    @ResponseBody
    @GetMapping(value = "/api/user/login", produces = {"application/json;charset=UTF-8"})
    public BlogResult login(String account, String password, HttpServletRequest request, HttpServletResponse response){
        return userService.login(account,password,request,response);
    }
    @ResponseBody
    @GetMapping(value = "/api/user/ifLogin", produces = {"application/json;charset=UTF-8"})
    public BlogResult ifLogin(HttpServletRequest request, HttpServletResponse response){
        return userService.ifLogin( request,  response);
    }
    @ResponseBody
    @GetMapping(value = "/api/user/exit", produces = {"application/json;charset=UTF-8"})
    public BlogResult exit(HttpServletRequest request, HttpServletResponse response){
        return userService.exit( request,  response);
    }

}
