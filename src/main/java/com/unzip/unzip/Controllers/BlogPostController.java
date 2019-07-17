package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class BlogPostController {
    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping(path="blogPost/add")
    public @ResponseBody String addBlogPost(@RequestParam Integer id, @RequestParam Integer userId, @RequestParam String title, @RequestParam String postText, @RequestParam String imageURL, @RequestParam Integer tag1, @RequestParam Integer tag2, @RequestParam Integer tag3){
        BlogPost b = new BlogPost();
        b.setId(id);
        b.setUserId(userId);
        b.setTitle(title);
        b.setPostText(postText);
        b.setImageURL(imageURL);
        b.setTag1(tag1);
        b.setTag1(tag2);
        b.setTag1(tag3);
        blogPostRepository.save(b);
        return "Saved";
    }

    @GetMapping(path="blogPost/all")
    public @ResponseBody Iterable<BlogPost> getAllBlogPost() {return blogPostRepository.findAll();}
}
