package com.zxj;

import com.zxj.pojo.User;
import com.zxj.service.UserService;
import com.zxj.service.UserServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
@MapperScan("com.zxj.mapper")
public class App {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

