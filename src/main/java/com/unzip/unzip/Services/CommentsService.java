package com.unzip.unzip.Services;

import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Repositories.BlogPostRepository;
import com.unzip.unzip.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentsService {
    @Autowired
    CommentsRepository commentsRepository;

    @Autowired
    BlogPostRepository blogPostRepository;

    public void save(Comments comment) {
        comment.setPosts(blogPostRepository.getOne(comment.getPostid()));
        commentsRepository.save(comment);
    }

    public Iterable<Comments> findAllByPostid(Integer postid) {
        return commentsRepository.findAllByPostid(postid);
    }

    public Optional<Comments> findById(Long id) {
        return commentsRepository.findById(id);
    }
}
