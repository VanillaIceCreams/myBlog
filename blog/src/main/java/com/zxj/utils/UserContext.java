package com.zxj.utils;

import com.zxj.pojo.User;

/**
 * Created by Administrator on 2018/1/26.
 */
public  class UserContext{

    private static final ThreadLocal<User> current = new ThreadLocal<User>();

    public UserContext(User user) {
        current.set(user);
    }

    public static User getCurrentUser() {
        return current.get();
    }

    public static void close() {
        current.remove();
    }
}