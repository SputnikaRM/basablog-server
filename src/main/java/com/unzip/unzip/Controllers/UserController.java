package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.User;
import com.unzip.unzip.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@Controller
@CrossOrigin
class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="users/add")
    public @ResponseBody String addNewUser(@RequestBody User user){
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="users/verify")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
