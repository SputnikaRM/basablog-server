package com.unzip.unzip.Controllers;

import com.unzip.unzip.Models.User;
import com.unzip.unzip.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="users/add")
    public @ResponseBody String addNewUser(@RequestParam Integer id, @RequestParam String username, @RequestParam String password, @RequestParam String emailAddress){
        User n = new User();
        n.setId(id);
        n.setUsername(username);
        n.setPassword(password);
        n.setEmailAddress(emailAddress);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="users/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
