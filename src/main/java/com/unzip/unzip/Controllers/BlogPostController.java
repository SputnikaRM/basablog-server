package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;

@RestController
@CrossOrigin
public class BlogPostController {
    @Autowired
    private BlogPostRepository blogPostRepository;

    @PostMapping(path="/blogPost/add")
    public String addBlogPost(@RequestBody BlogPost post){
        blogPostRepository.save(post);
        return "Saved";
    }
    @GetMapping(path="/blogPost/{id}")
    public BlogPost getBlogPost(@PathVariable Integer id) {
        return blogPostRepository.findById(id).get();
    }

    @DeleteMapping(path="/blogPost/{id}")
    public String deleteBlogPost(@PathVariable Integer id) {
        blogPostRepository.deleteById(id);
        return "Deleted";
    }

    @GetMapping(path="/blogPost/all")
    public Iterable<BlogPost> getAllBlogPost() {return blogPostRepository.findAll();}

    @GetMapping(path="/blogPost/all/{tag}")
    public List<BlogPost> findAllBlogPostByTag1(@PathVariable String tag){
        return blogPostRepository.findAllByTag1(tag);
    }

    @GetMapping(path="/user/{id}/blogPost/all")
    public List<BlogPost> getAllBlogPostsByUser(@PathVariable Integer id){
        return blogPostRepository.findAllByUserId(id);
    }
    @GetMapping(path="/user/{userId}/blogPost/{postId}")
    public BlogPost getPostByUser(@PathVariable Integer userId, @PathVariable Integer postId) {
        return blogPostRepository.findBlogPostByUserIdAndAndId(userId, postId);
    }
    @PutMapping(path="/blogPost/edit/{id}")
    public String updateBlogPost(@RequestBody BlogPost post, @PathVariable Integer id) {
        BlogPost oldPost = blogPostRepository.findById(id).get();
        oldPost.setTitle(post.getTitle());
        oldPost.setPostText(post.getPostText());
        oldPost.setImageURL(post.getImageURL());
        blogPostRepository.save(oldPost);
        return "Updated";
    }
    @GetMapping(path="/blogPost/all/reverse")
    public List<BlogPost> getAllBlogPostDesc() {
        return blogPostRepository.findByOrderByIdDesc();
    }

}
