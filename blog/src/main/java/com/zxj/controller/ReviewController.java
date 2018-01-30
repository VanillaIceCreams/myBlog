package com.zxj.controller;

import com.zxj.pojo.Review;
import com.zxj.service.ReviewService;
import com.zxj.utils.BlogResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/1/18.
 */
@Controller
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @ResponseBody
    @GetMapping(value = "/api/review/{articleId}", produces = {"application/json;charset=UTF-8"})
    public BlogResult getReview (@PathVariable String articleId){
        return reviewService.findReviewByArticleId(articleId);
    }
    @ResponseBody
    @PutMapping (value = "/api/review", produces = {"application/json;charset=UTF-8"})
    public BlogResult createReview (@RequestBody Review review){
        return reviewService.addReview(review);
    }
    @ResponseBody
    @DeleteMapping (value = "/authc/api/review", produces = {"application/json;charset=UTF-8"})
    public BlogResult deleteReview (String reviewId){
        return reviewService.deleReviewById(reviewId);
    }
    @ResponseBody
    @GetMapping(value = "/api/recentReview", produces = {"application/json;charset=UTF-8"})
    public BlogResult getRecentReview (int num){
        return reviewService.getRecentReview(num);
    }
}
