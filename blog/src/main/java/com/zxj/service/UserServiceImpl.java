package com.zxj.service;

import com.zxj.mapper.UserMapper;
import com.zxj.pojo.User;
import com.zxj.pojo.UserExample;
import com.zxj.utils.BlogResult;
import com.zxj.utils.CookieUtils;
import com.zxj.utils.ExceptionUtil;
import com.zxj.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018/1/18.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired(required=false)
    private UserMapper userMapper;

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public BlogResult addUser(User user) {
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));

        try {
            if( userMapper.selectByAccount(user.getAccount())!=null){
                return BlogResult.build(403,"该账户已被注册");
            }else {
                userMapper.insert(user);
            }
        }catch (Exception e){
            return BlogResult.build(500, "未知错误");
        }
        return BlogResult.ok();
    }

    @Override
    public List<User> findAllUser(String pageNum, String pageSize) {
        return null;
    }

    @Override
    public User finUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public BlogResult login(String account, String password,HttpServletRequest request, HttpServletResponse response) {
        UserExample userExample =  new UserExample();
        //这里的MD5加密应该放在前台的，为了调试方便才加在这里！！！！！！！
        userExample.createCriteria().andAccountEqualTo(account).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if(users!=null&&users.size()!=0){//若账号密码正确，则设置cookie并返回成功信息
            User user = users.get(0);
            CookieUtils.setCookie(request, response, "ZXJ_BLOG_ACCOUNT", account);
            CookieUtils.setCookie(request, response, "ZXJ_BLOG_PASSWORD", user.getPassword());
            return BlogResult.ok(user);
        }
       else{
            return BlogResult.build(405,"用户名或密码错误");
        }
    }

    @Override
    public BlogResult ifLogin(HttpServletRequest request, HttpServletResponse response) {
        UserExample userExample =  new UserExample();
        if(CookieUtils.getCookieValue(request,"ZXJ_BLOG_ACCOUNT")!=null&&CookieUtils.getCookieValue(request,"ZXJ_BLOG_PASSWORD")!=null) {
            userExample.createCriteria()
                    .andAccountEqualTo(CookieUtils.getCookieValue(request, "ZXJ_BLOG_ACCOUNT"))
                    .andPasswordEqualTo(CookieUtils.getCookieValue(request, "ZXJ_BLOG_PASSWORD"));
            List<User> users = userMapper.selectByExample(userExample);
            if (users != null && users.size() != 0) {//成功
                return BlogResult.ok(users.get(0));
            }
        }
        return BlogResult.build(403,"未登录");
    }

    @Override
    public BlogResult exit(HttpServletRequest request, HttpServletResponse response) {
        CookieUtils.deleteCookie(request, response,"ZXJ_BLOG_ACCOUNT");
        CookieUtils.deleteCookie(request, response,"ZXJ_BLOG_PASSWORD");
        return BlogResult.ok();
    }
}
