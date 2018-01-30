package com.zxj.service;

import com.github.pagehelper.PageHelper;
import com.zxj.mapper.ArticleMapper;
import com.zxj.pojo.Article;
import com.zxj.pojo.ArticleExample;
import com.zxj.pojo.User;
import com.zxj.utils.BlogResult;
import com.zxj.utils.WhetherPaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018/1/18.
 */
@Service
public class ArticleServiceImpl implements  ArticleService{

    @Autowired(required=false)
    private ArticleMapper articleMapper;

    /**
     * 添加文章
     * @param article
     * @return 返回文章的ID，用于跳转到相应页面
     */
    @Override
    public BlogResult addArticle(Article article) {
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        article.setAuthor("章夏杰");
        articleMapper.insertSelective(article);
        return BlogResult.ok(article.getArticleId());
    }
//修改文章
    @Override
    public BlogResult updateArticle(Article article) {
        article.setUpdateTime(new Date());
        articleMapper.updateByPrimaryKeySelective(article);
        return BlogResult.ok(article.getArticleId());
    }

    /**
     * 根据主键删除文章
     * @param articleId 主键ID
     * @return
     */
    @Override
    public BlogResult deleArticleById(String articleId) {
        articleMapper.deleteByPrimaryKey(articleId);
        return BlogResult.ok();
    }

    /**
     * 分页查找除文章内容外的所有信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public BlogResult findAllArticleExceptContent(String pageNum, String pageSize) {
        WhetherPaging.judgePaging(pageNum,pageSize);
        return   BlogResult.ok(articleMapper.findAllArticleExceptContent());
    }

    /**
     * 通过主键查找文章
     * @param articleId
     * @return
     */
    @Override
    public BlogResult finArticleById(String articleId) {
        Article article = articleMapper.selectByPrimaryKey(articleId);

        return BlogResult.ok(article);
    }

    /**
     * 根据 分类 分页查找文章（不包含内容）
     * @param pageNum
     * @param pageSize
     * @param sortId
     * @param lv
     * @return
     */
    @Override
    public BlogResult pagingfindAllArticleExceptContentBySort(String pageNum, String pageSize,String sortId,String lv) {
        WhetherPaging.judgePaging(pageNum,pageSize);
        if("one".equals(lv)){
            return  BlogResult.ok(articleMapper.findAllArticleExceptContentBySort1(sortId));
        }
        else if("two".equals(lv)){
            return  BlogResult.ok(articleMapper.findAllArticleExceptContentBySort2(sortId));
        }else{
            return BlogResult.build(400,"找不到本项目");
        }
    }

    @Override
    public BlogResult findArticleAmountBySort(String sortId, String lv) {
        if("one".equals(lv)){
            ArticleExample articleExample = new ArticleExample();
            articleExample.createCriteria().andSortOneEqualTo(sortId);
            return  BlogResult.ok(articleMapper.countByExample(articleExample));
        }
        else if("two".equals(lv)){
            ArticleExample articleExample = new ArticleExample();
            articleExample.createCriteria().andSortTwoEqualTo(sortId);
            return  BlogResult.ok(articleMapper.countByExample(articleExample));
        }else{
            return BlogResult.build(400,"找不到本项目");
        }
    }

    @Override
    public BlogResult deleteArticleById(String articleId) {
       articleMapper.deleteByPrimaryKey(articleId);
        return BlogResult.ok();
    }

    @Override
    public BlogResult getRecentArticle(int num) {
        return BlogResult.ok(articleMapper.getRecentArticle(num));
    }


}
