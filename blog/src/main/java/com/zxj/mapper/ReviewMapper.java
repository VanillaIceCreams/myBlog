package com.zxj.mapper;

import com.zxj.pojo.Review;
import com.zxj.pojo.ReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewMapper {
    int countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(String reviewId);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExampleWithBLOBs(ReviewExample example);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(String reviewId);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExampleWithBLOBs(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKeyWithBLOBs(Review record);

    int updateByPrimaryKey(Review record);
    //自己的
    List<Review> findReviewByArticleId(String articleId);

    List<Review> getRecentReview(int num);
}