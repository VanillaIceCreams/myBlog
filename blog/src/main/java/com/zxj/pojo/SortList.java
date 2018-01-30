package com.zxj.pojo;

import java.util.List;

/**
 * Created by Administrator on 2018/1/24.
 */
public class SortList {
    private Sort sort1;
    private List<Sort> sort2s;
    public SortList(){}
    public SortList(Sort sort1, List<Sort> sort2s) {
        this.sort1 = sort1;
        this.sort2s = sort2s;
    }

    public Sort getSort1() {
        return sort1;
    }

    public void setSort1(Sort sort1) {
        this.sort1 = sort1;
    }

    public List<Sort> getSort2s() {
        return sort2s;
    }

    public void setSort2s(List<Sort> sort2s) {
        this.sort2s = sort2s;
    }
}
