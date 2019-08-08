package com.unzip.unzip.Services;


import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Models.Tags;
import com.unzip.unzip.Repositories.BlogPostRepository;
import com.unzip.unzip.Repositories.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagsService {

    @Autowired
    TagsRepository tagsRepository;


    public List<BlogPost> findAllByTag(String tag) {
        List<Tags> taggedPosts = tagsRepository.findAllTagsByTag(tag);
        ArrayList<BlogPost> posts = new ArrayList<>();
        for (Tags tags : taggedPosts) posts.addAll(tags.getPosts());
        return posts;
    }

    public List<BlogPost> findById(Integer id) {
        Tags tag = tagsRepository.findById(id).get();
        return tag.getPosts();
    }
}
