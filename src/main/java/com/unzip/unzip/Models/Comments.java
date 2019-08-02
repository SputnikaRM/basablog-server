package com.unzip.unzip.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private Integer userid;
    private Integer postid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private BlogPost blogpost;

    public Comments(String body,Integer userid,Integer postid, BlogPost post) {

        this.body = body;
        this.userid = userid;
        this.postid = postid;
        this.blogpost = post;
    }

    public Comments() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId( Long id) {
        this.id = id;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPostid() {
        return this.postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }
    @JsonIgnore
    public BlogPost getPosts() {
        return blogpost;
    }

    public void setPosts(BlogPost posts) {
        this.blogpost = posts;
    }
}

