package com.zxj.service;

import com.zxj.pojo.Review;
import com.zxj.utils.BlogResult;

import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
public interface ReviewService {
    BlogResult addReview(Review Review);
    BlogResult findReviewByArticleId(String articleId);
    BlogResult deleReviewById(String  reviewId);
    BlogResult pagingfinArticleById(String pageNum, String pageSize,String articleId);

    BlogResult getRecentReview(int num);
}
