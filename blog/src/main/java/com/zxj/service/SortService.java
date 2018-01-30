package com.zxj.service;

import com.zxj.pojo.Sort;
import com.zxj.utils.BlogResult;

/**
 * Created by Administrator on 2018/1/18.
 */
public interface SortService {
    BlogResult findSort1();
    BlogResult findSort2(String parent);
    BlogResult addSort(Sort sort);

    BlogResult getSortList();
}
