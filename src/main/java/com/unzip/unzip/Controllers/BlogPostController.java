package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogPostController {
    @Autowired
    private BlogPostRepository blogPostRepository;

    @PostMapping(path="/blogPost/add")
    public String addBlogPost(@RequestBody BlogPost post){
        blogPostRepository.save(post);
        return "Saved";
    }

    @GetMapping(path="/blogPost/all")
    public @ResponseBody Iterable<BlogPost> getAllBlogPost() {return blogPostRepository.findAll();}
}
