package com.unzip.unzip.Models;

import javax.persistence.*;

@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private Integer userid;
    private Integer postid;

    public Comments(String body,Integer userid,Integer postid) {

        this.body = body;
        this.userid = userid;
        this.postid = postid;
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
}

