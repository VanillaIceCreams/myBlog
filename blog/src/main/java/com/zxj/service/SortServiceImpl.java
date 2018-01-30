package com.zxj.service;

import com.zxj.mapper.ReviewMapper;
import com.zxj.mapper.SortMapper;
import com.zxj.pojo.Sort;
import com.zxj.pojo.SortList;
import com.zxj.utils.BlogResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018/1/18.
 */
@Service
public class SortServiceImpl implements SortService{
    @Autowired(required=false)
    private SortMapper sortMapper;
    @Override
    public BlogResult findSort1() {
        return BlogResult.ok(sortMapper.findSort1());
    }

    @Override
    public BlogResult findSort2(String parent) {
        return BlogResult.ok(sortMapper.findSort2(parent));
    }

    @Override
    public BlogResult addSort(Sort sort) {
        return BlogResult.ok(sortMapper.insert(sort));
    }

    @Override
    public BlogResult getSortList() {
        List<SortList> listSortList =  new ArrayList<SortList>();
        List<Sort> sort1s = sortMapper.findSort1();
        for(Sort s : sort1s){;
            SortList sortList = new SortList(s,sortMapper.findSort2(s.getSortId()));
            listSortList.add(sortList);
        }
    return BlogResult.ok(listSortList);
    }
}
