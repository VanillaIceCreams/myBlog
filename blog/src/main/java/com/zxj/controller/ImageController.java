package com.zxj.controller;

import ch.qos.logback.core.util.FileUtil;
import com.zxj.pojo.Image;
import com.zxj.service.ImageService;
import com.zxj.utils.BlogResult;
import com.zxj.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Administrator on 2018/1/18.
 */
@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @ResponseBody
    @PutMapping(value = "/authc/api/image/", produces = {"application/json;charset=UTF-8"})
    public BlogResult addImage(@RequestParam("file") MultipartFile file,HttpServletRequest request){
        return imageService.addImage(file,request);
    }
    @ResponseBody
    @GetMapping(value = "/authc/api/image/", produces = {"application/json;charset=UTF-8"})
    public BlogResult getImage(String pageNum, String pageSize){
        return imageService.getImage(pageNum,pageSize);
    }
    @ResponseBody
    @DeleteMapping(value = "/authc/api/image/", produces = {"application/json;charset=UTF-8"})
    public BlogResult deleteImage(@RequestBody String imageId){
        return imageService.deleteImage(imageId);
    }


}
