package com.unzip.unzip.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "blog_post")
public class BlogPost {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(nullable=false)
    private Integer userId;
    @Column(nullable=false)
    private String title;
    @Column(nullable=false, columnDefinition = "TEXT")
    private String postText;
    @Column(length = 500)
    private String imageURL;
    private String tag;
    private Integer posthashId;
    private Long timeStamp;


    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Tags tags;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blogpost")
    @LazyCollection(LazyCollectionOption.TRUE)
    @JsonManagedReference
    private List<Comments> comments = new ArrayList<>();


    public BlogPost() {
    }

    public BlogPost(Integer userId, String title, String postText, String imageURL, String tag, Long timeStamp) {
        this.userId = userId;
        this.title = title;
        this.postText = postText;
        this.imageURL = imageURL;
        this.tag = tag;
        this.timeStamp= (long) ((title + userId + timeStamp).hashCode());


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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments){
        this.comments = comments;
    }


    public Integer getHashpostId() {
        return posthashId;
    }

    public void setHashpostId(String title, Integer userId, Long timeStamp) {
        this.posthashId = ((title + userId+timeStamp).hashCode());
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp() {
        this.timeStamp = new Date().getTime() ;
    }

}


