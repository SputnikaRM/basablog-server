package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Repositories.CommentsRepository;
import com.unzip.unzip.Services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
    public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping(path="/comments/add")
    public String addNewComment(@RequestBody Comments comment){
        commentsService.save(comment);
        return "Saved";
    }

    @GetMapping(path="/{postid}/comments/all")
    public Iterable<Comments> getAllBlogPostComments(@PathVariable Integer postid){
        return commentsService.findAllByPostid(postid);
    }

//    @PutMapping(path="{postid}/comments/{id}")
//    public String editComment(@PathVariable Integer postid, @PathVariable Long id, @RequestBody Comments comment){
//        Comments oldComment = commentsService.findById(id).get();
//        oldComment.setBody(comment.getBody());
//        commentsService.save(comment);
//        return "updated";
//    }
}


