package com.zxj.interceptor;
import com.zxj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2018/1/26.
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private UserService userService;
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new LoginInterceptor(userService)).addPathPatterns("/authc/**");
        }
    }
