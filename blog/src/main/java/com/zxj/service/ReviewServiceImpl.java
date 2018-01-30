package com.zxj.service;

import com.github.pagehelper.PageHelper;
import com.zxj.mapper.ReviewMapper;
import com.zxj.pojo.Review;
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
public class ReviewServiceImpl implements ReviewService {

    @Autowired(required=false)
    private ReviewMapper reviewMapper;
    @Override
    public BlogResult addReview(Review review) {
        review.setCreateTime(new Date());
        reviewMapper.insert(review);
        return BlogResult.ok();
    }

    @Override
    public BlogResult findReviewByArticleId(String articleId ) {
        return   BlogResult.ok(reviewMapper.findReviewByArticleId(articleId));
    }
    @Override
    public BlogResult pagingfinArticleById(String pageNum, String pageSize,String articleId) {
        WhetherPaging.judgePaging(pageNum,pageSize);
        return BlogResult.ok(reviewMapper.findReviewByArticleId(articleId));
    }

    @Override
    public BlogResult getRecentReview(int num) {
        List<Review> recentReview = reviewMapper.getRecentReview(num);
        return BlogResult.ok(recentReview);
    }

    @Override
    public BlogResult deleReviewById(String reviewId) {
        reviewMapper.deleteByPrimaryKey(reviewId);
        return BlogResult.ok();
    }



}
