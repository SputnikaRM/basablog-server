package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
    public class CommentsController {

    @Autowired
    private CommentsRepository commentsRepo;

    @PostMapping(path="/comments/add")
    public String addNewComment(@RequestBody Comments comments){
        commentsRepo.save(comments);
        return "Saved";
    }

    @GetMapping(path="/{postid}/comments/all")
    public @ResponseBody Iterable<Comments> getAllBlogPostComments(@PathVariable Integer postid){
        return commentsRepo.findAllByPostid(postid);
    }
}


