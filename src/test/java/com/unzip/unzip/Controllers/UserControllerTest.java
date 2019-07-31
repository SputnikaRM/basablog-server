package com.unzip.unzip.Controllers;

import com.unzip.unzip.Repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserController controller;

    @Test
    public void addNewUser() {
    }

    @Test
    public void verifyUser() {
    }
}
