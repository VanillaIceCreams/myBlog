package com.zxj.interceptor;


import com.zxj.pojo.User;
import com.zxj.service.UserService;
import com.zxj.utils.BlogResult;
import com.zxj.utils.UserContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Administrator on 2018/1/26.
 */
public class LoginInterceptor implements HandlerInterceptor {
    private UserService userService;

    public LoginInterceptor(UserService userService) {
        this.userService = userService;
    }

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        BlogResult blogResult = userService.ifLogin(request, response);
        if (blogResult.getStatus() == 200) {
            new UserContext((User) blogResult.getData());
            return true;
        } else {
            response.getWriter().print(409);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        UserContext.close();
    }
}

