package com.unzip.unzip.Services;

import com.unzip.unzip.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository repository;
}
