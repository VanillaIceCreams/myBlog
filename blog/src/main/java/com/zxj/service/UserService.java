package com.zxj.service;

import com.zxj.pojo.User;
import com.zxj.utils.BlogResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
public interface UserService {
    BlogResult addUser(User user);
    List<User> findAllUser(String pageNum, String pageSize);
    User finUserById(String userId);


    BlogResult login(String account, String password, HttpServletRequest request, HttpServletResponse response);


    BlogResult ifLogin(HttpServletRequest request, HttpServletResponse response);

    BlogResult exit(HttpServletRequest request, HttpServletResponse response);
}
