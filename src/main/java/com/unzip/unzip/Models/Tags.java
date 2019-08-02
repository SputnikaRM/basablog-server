package com.unzip.unzip.Models;

import javax.persistence.*;

@Entity
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tagsId;
    @Column
    private String tag;
    private Integer postId;

    public Tags() {
    }

    public Tags(String tag, Integer postId) {
        this.tag = tag;
        this.postId = postId;
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

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

}
