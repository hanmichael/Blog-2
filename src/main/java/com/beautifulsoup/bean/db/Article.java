package com.beautifulsoup.bean.db;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private String subtitle;

    private String description;

    private String imgUrl;

    private String stars="164";

    private Integer categoryId;

    private Integer authorId=5;

    private Date createTime=new Date();

    private String content;

    public Article() {
    }

    public Article(String title, String subtitle, String description, String stars, Integer categoryId, Integer authorId, Date createTime, String content) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.stars = stars;
        this.categoryId = categoryId;
        this.authorId = authorId;
        this.createTime = createTime;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars == null ? null : stars.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", stars='" + stars + '\'' +
                ", categoryId=" + categoryId +
                ", authorId=" + authorId +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                '}';
    }
}