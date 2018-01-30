package com.zxj.service;

import com.zxj.pojo.Image;
import com.zxj.pojo.User;
import com.zxj.utils.BlogResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
public interface ImageService {


    BlogResult addImage(MultipartFile file,HttpServletRequest request);

    BlogResult getImage(String pageNum, String pageSize);

    BlogResult deleteImage(String imageId);
}
