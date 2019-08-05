package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Repositories.BlogPostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BlogPostControllerTest {

    @Mock
    private BlogPostRepository repository;


    @InjectMocks
    private BlogPostController controller;

    private List<BlogPost> stubData() {
        BlogPost post1 = new BlogPost();
        post1.setId(1);
        BlogPost post2 = new BlogPost();
        post2.setId(2);
        return Arrays.asList(post1, post2);
    }

    private BlogPost mockBlogPost() {
        return new BlogPost();
    }


    @Test
    public void getAllBlogPost() {


    }

    @Test
    public void addBlogPost() {
    }

    @Test
    public void getBlogPost() {
        when(repository.findById(1).get()).thenReturn(stubData().get(0));
    }

    @Test
    public void getAllBlogPost1() {
    }

    @Test
    public void findAllBlogPostByTag1() {
    }

    @Test
    public void getAllBlogPostsByUser() {
    }

    @Test
    public void getPostByUser() {
    }

    @Test
    public void updateBlogPost() {
    }

    @Test
    public void getAllBlogPostDesc() {
    }

}
