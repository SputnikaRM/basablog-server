package com.unzip.unzip.Models;

import javax.persistence.*;

@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private String title;
    private String postText;
    private String imageURL;
    private Integer tag1;
    private Integer tag2;
    private Integer tag3;

    public BlogPost() {
    }

    public BlogPost(Integer userId, String title, String postText, String imageURL, Integer tag1, Integer tag2, Integer tag3) {
        this.userId = userId;
        this.title = title;
        this.postText = postText;
        this.imageURL = imageURL;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getTag1() {
        return tag1;
    }

    public void setTag1(Integer tag1) {
        this.tag1 = tag1;
    }

    public Integer getTag2() {
        return tag2;
    }

    public void setTag2(Integer tag2) {
        this.tag2 = tag2;
    }

    public Integer getTag3() {
        return tag3;
    }

    public void setTag3(Integer tag3) {
        this.tag3 = tag3;
    }
}


