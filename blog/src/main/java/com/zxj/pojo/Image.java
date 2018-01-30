package com.zxj.pojo;

import java.util.Date;

public class Image {
    private String imageId;

    private Date createDate;
    
    public Image() {
    }

    public Image(String imageId, Date createDate) {
        this.imageId = imageId;
        this.createDate = createDate;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}