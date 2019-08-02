package com.unzip.unzip.Controllers;

import com.unzip.unzip.Repositories.CommentsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CommentsControllerTest {

    @Mock
    private CommentsRepository repository;

    @InjectMocks
    private CommentsController controller;

    @Test
    public void addNewComment() {
    }

    @Test
    public void getAllBlogPostComments() {
    }

    @Test
    public void editComment() {
    }
}
