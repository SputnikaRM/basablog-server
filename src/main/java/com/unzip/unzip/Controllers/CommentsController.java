package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
    public class CommentsController {
        @Autowired
        private CommentsRepository commentsRepo;

        @GetMapping(path="/comments/add")
        public @ResponseBody
        String addNewComment(@RequestParam String body, @RequestParam Integer userid, @RequestParam Integer postid){
            Comments n = new Comments(body,userid,postid);

            commentsRepo.save(n);
            return "Saved";
        }

        @GetMapping(path="/comments/all")
        public @ResponseBody Iterable<Comments> getAllUsers(){
            return commentsRepo.findAll();
        }
    }


