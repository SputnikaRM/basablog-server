package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Models.Tags;
import com.unzip.unzip.Services.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TagsController {
    @Autowired
    TagsService tagsService;

    @GetMapping(path="/blogPost/all/{tag}")
    public List<BlogPost> getAllByTag(@PathVariable String tag) {
        return tagsService.findAllByTag(tag);
    }


}
