package com.zxj.pojo;

import java.util.Date;
import java.util.UUID;

public class Article {
    private String articleId;

    private String title;

    private String overview;

    private String author;

    private String markdown;

    private String content;

    private Date createTime;

    private Date updateTime;

    private String sortOne;

    private String sortTwo;

    private String imageLarge;

    private String imageSmall;
    public Article() {
        this.articleId = UUID.randomUUID().toString();
}
    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown == null ? null : markdown.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSortOne() {
        return sortOne;
    }

    public void setSortOne(String sortOne) {
        this.sortOne = sortOne == null ? null : sortOne.trim();
    }

    public String getSortTwo() {
        return sortTwo;
    }

    public void setSortTwo(String sortTwo) {
        this.sortTwo = sortTwo == null ? null : sortTwo.trim();
    }

    public String getImageLarge() {
        return imageLarge;
    }

    public void setImageLarge(String imageLarge) {
        this.imageLarge = imageLarge == null ? null : imageLarge.trim();
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall == null ? null : imageSmall.trim();
    }
}