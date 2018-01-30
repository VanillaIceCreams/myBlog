package com.zxj.utils;

import com.github.pagehelper.PageHelper;

/**
 * Created by Administrator on 2018/1/18.
 */
public class WhetherPaging {
    public static void judgePaging(String pageNum,String pageSize){
        if(pageNum!=null&&pageSize!=null){
            PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        }
    }
}
