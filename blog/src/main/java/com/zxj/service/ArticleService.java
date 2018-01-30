package com.zxj.service;

import com.zxj.pojo.Article;
import com.zxj.utils.BlogResult;

import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
public interface ArticleService {
    BlogResult addArticle(Article Article);
    BlogResult updateArticle(Article Article);
    BlogResult deleArticleById(String articleId);
    BlogResult findAllArticleExceptContent(String pageNum, String pageSize);
    BlogResult finArticleById(String ArticleId);
    BlogResult pagingfindAllArticleExceptContentBySort(String pageNum, String pageSize,String sortId,String lv);


    BlogResult findArticleAmountBySort(String sortId, String lv);

    BlogResult deleteArticleById(String articleId);

    BlogResult getRecentArticle(int num);
}
