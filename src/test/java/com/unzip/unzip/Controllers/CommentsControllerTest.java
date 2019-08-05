package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Repositories.BlogPostRepository;
import com.unzip.unzip.Services.CommentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Repositories.CommentsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CommentsControllerTest {

    @Mock
    private CommentsRepository comments;


    @InjectMocks
    private CommentsController controller;

    @Test
    public void addNewComment() {



    }




//        Comments comment = new Comments();
//        comment.setPostid(1);
//        controller.addNewComment(comment);
//        Integer actual =repository.findAllByPostid(1).size();
//        Integer expected = 1;
//
//        Assert.assertEquals(expected,actual);


    @Test
    public void getAllBlogPostComments() {
        when(comments.findById(1L).get()).thenReturn();
        controller.getAllBlogPostComments(1);
        verify(comments, times(1)).findById(1L);
    }

    @Test
    public void editComment() {
    }
}
