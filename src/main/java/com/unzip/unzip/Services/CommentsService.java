package com.unzip.unzip.Services;

import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {
    @Autowired
    CommentsRepository commentsRepository;
}
