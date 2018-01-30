package com.zxj.mapper;

import com.zxj.pojo.Article;
import com.zxj.pojo.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {
    int countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(String articleId);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(String articleId);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
    /*
    自己的方法
     */
    //找出所有文章
    List<Article> findAllArticleExceptContent();
    //根据分类1找
    List<Article>  findAllArticleExceptContentBySort2(String sort_two);
    //根据分类2找
    List<Article>  findAllArticleExceptContentBySort1(String sort_one);

    List<Article>  getRecentArticle(int num);
}