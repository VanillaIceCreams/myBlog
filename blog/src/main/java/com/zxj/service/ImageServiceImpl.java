package com.zxj.service;

import com.zxj.mapper.ImageMapper;
import com.zxj.pojo.Image;
import com.zxj.pojo.ImageExample;
import com.zxj.utils.BlogResult;
import com.zxj.utils.ImageUtil;
import com.zxj.utils.WhetherPaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service(value = "imageService")
public class ImageServiceImpl implements ImageService {
    @Autowired(required = false)
    private ImageMapper imageMapper;


    @Override
    public BlogResult addImage(MultipartFile file,HttpServletRequest request) {
        //static文件夹路径
        String path = this.getClass().getResource("/static/image/").getPath().replaceFirst("/","");
        //后缀名
        String suffix = ImageUtil.getTypeName(file.getContentType());
        //图片UUID名
        String imgName = UUID.randomUUID().toString()+suffix;
        //最终存放路径
        String finalURL = path+imgName;

        Image image  =  new Image(imgName,new Date());
        try {
            Files.write(Paths.get(finalURL), file.getBytes(), StandardOpenOption.CREATE);
            imageMapper.insert(image);
        } catch (Exception e) {
            return BlogResult.build(500,"服务器出错");
        }
        return BlogResult.ok(imgName);
    }

    @Override
    public BlogResult getImage(String pageNum, String pageSize) {
        WhetherPaging.judgePaging(pageNum,pageSize);
        ImageExample imageExample  = new ImageExample();
        imageExample.createCriteria();
        List<Image> images = imageMapper.selectByExample(imageExample);
        return BlogResult.ok(images);
    }

    @Override
    public BlogResult deleteImage(String imageId) {
        imageMapper.deleteByPrimaryKey(imageId);
        //static文件夹路径
        String path = this.getClass().getResource("/static/image/").getPath().replaceFirst("/","");
        final Path path1 = Paths.get(path + imageId);
        try {
            Files.delete(path1);
            return BlogResult.ok();
        } catch (IOException e) {
            e.printStackTrace();
            return BlogResult.build(500,"删除文件失败");
        }

    }
}
