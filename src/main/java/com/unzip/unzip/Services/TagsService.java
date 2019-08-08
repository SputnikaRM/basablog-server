package com.unzip.unzip.Services;


import com.unzip.unzip.Models.Tags;
import com.unzip.unzip.Repositories.BlogPostRepository;
import com.unzip.unzip.Repositories.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagsService {

    @Autowired
    TagsRepository tagsRepository;

    @Autowired
    BlogPostRepository blogPostRepository;

    public void save(Tags tag){


        tagsRepository.save(tag);

    }
}
