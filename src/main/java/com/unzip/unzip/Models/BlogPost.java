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
    private String tag1;



    public BlogPost() {
    }

    public BlogPost(Integer userId, String title, String postText, String imageURL, String tag1) {
        this.userId = userId;
        this.title = title;
        this.postText = postText;
        this.imageURL = imageURL;
        this.tag1 = tag1;

    }

    public BlogPost(String title, String postText, Integer userId) {
        this.title = title;
        this.postText = postText;
        this.userId = userId;
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

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }


}


