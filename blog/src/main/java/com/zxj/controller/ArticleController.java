package com.zxj.controller;

import com.zxj.pojo.Article;
import com.zxj.pojo.User;
import com.zxj.service.ArticleService;
import com.zxj.service.UserService;
import com.zxj.utils.BlogResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/1/18.
 */
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 单纯的分页查找文章列表，目前没用处
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/api/article", produces = {"application/json;charset=UTF-8"})
    public BlogResult getArticle(String pageNum, String pageSize) {
        return articleService.findAllArticleExceptContent(pageNum, pageSize);
    }

    /**
     * 根据文章ID找文章
     * @param articleId
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/api/article/{articleId}", produces = {"application/json;charset=UTF-8"})
    public BlogResult getArticleById(@PathVariable String articleId) {
        return articleService.finArticleById(articleId);
    }


    @ResponseBody
    @GetMapping(value = "/api/article/{lv}/{sortId}", produces = {"application/json;charset=UTF-8"})
    public BlogResult getArticle(String pageNum, String pageSize, @PathVariable String sortId, @PathVariable String lv) {
        return articleService.pagingfindAllArticleExceptContentBySort(pageNum, pageSize, sortId, lv);
    }

    @ResponseBody
    @PutMapping(value = "/authc/api/article", produces = {"application/json;charset=UTF-8"})
    public BlogResult addArticle(@RequestBody Article article) {
        return articleService.addArticle(article);
    }
    //修改单篇文章
    @ResponseBody
    @PostMapping(value = "/authc/api/article", produces = {"application/json;charset=UTF-8"})
    public BlogResult updateArticle(@RequestBody Article article) {
        return articleService.updateArticle(article);
    }

    //根据分类获取文章列表
    @ResponseBody
    @GetMapping(value = "/api/articleAmount/{lv}/{sortId}", produces = {"application/json;charset=UTF-8"})
    public BlogResult getArticleAmount(@PathVariable String sortId, @PathVariable String lv) {
        return articleService.findArticleAmountBySort(sortId, lv);
    }
    //根据分类获取文章列表
    @ResponseBody
    @DeleteMapping(value = "/api/article", produces = {"application/json;charset=UTF-8"})
    public BlogResult deleteArticleById(@RequestBody String articleId) {
        return articleService.deleteArticleById(articleId);
    }
    //获取最近的num篇文章
    @ResponseBody
    @GetMapping(value = "/api/recentArticle", produces = {"application/json;charset=UTF-8"})
    public BlogResult getRecentArticle(int num) {
        return articleService.getRecentArticle(num);
    }

}
