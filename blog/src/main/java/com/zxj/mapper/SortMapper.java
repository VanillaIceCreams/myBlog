package com.zxj.mapper;

import com.zxj.pojo.Sort;
import com.zxj.pojo.SortExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SortMapper {
    int countByExample(SortExample example);

    int deleteByExample(SortExample example);

    int deleteByPrimaryKey(String sortId);

    int insert(Sort record);

    int insertSelective(Sort record);

    List<Sort> selectByExample(SortExample example);

    Sort selectByPrimaryKey(String sortId);

    int updateByExampleSelective(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByExample(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByPrimaryKeySelective(Sort record);

    int updateByPrimaryKey(Sort record);

    List<Sort> findSort1();

    List<Sort> findSort2(String parent);
}