package com.zxj.utils;

/**
 * Created by Administrator on 2018/1/29.
 */
public class ImageUtil {
    public static String getTypeName(String contentType){
        if(contentType.contains("image")){
            if(contentType.contains("gif")){
                return ".gif";
            }else if(contentType.contains("jpeg")){
                return ".jpg";
            }else if(contentType.contains("png")){
                return ".png";
            }else{
                return null;
            }
        }
        return null;
    }
}
