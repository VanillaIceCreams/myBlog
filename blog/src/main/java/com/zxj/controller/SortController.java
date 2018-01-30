package com.zxj.controller;

import com.zxj.service.SortService;
import com.zxj.utils.BlogResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/1/18.
 */
@Controller
public class SortController {
    @Autowired
    private SortService sortService;

    @ResponseBody
    @GetMapping(value = "/api/sort/one", produces = {"application/json;charset=UTF-8"})
    public BlogResult getSortOne (){
        return sortService.findSort1();
    }
    @ResponseBody
    @GetMapping(value = "/api/sort/two", produces = {"application/json;charset=UTF-8"})
    public BlogResult getSortTwo (String parent){
        return sortService.findSort2(parent);
    }
    @ResponseBody
    @GetMapping(value = "/api/sort", produces = {"application/json;charset=UTF-8"})
    public BlogResult getSortList (){
        return sortService.getSortList();
    }
}
