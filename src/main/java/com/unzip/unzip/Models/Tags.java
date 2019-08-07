package com.unzip.unzip.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tagsId;
    private String tag;


    @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name="posthashId",nullable = true)
    @JsonBackReference
    private BlogPost post;


    public Tags() {
    }

    public Tags(String tag,Integer posthashId) {
        this.tag = tag;

       // this.postId = postId;
    }

    public Integer getTagsId() {
        return tagsId;
    }

    public void setTagsId(Integer tagsId) {
        this.tagsId = tagsId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    }

//    public Integer getPostId() {
//        return postId;
//    }
//
//    public void setPostId(Integer postId) {
//        this.postId = postId;
//    }


