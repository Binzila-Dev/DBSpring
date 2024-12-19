package com.example.DBSpring.controller;

import com.example.DBSpring.model.User;
import com.example.DBSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signin")
    public User addUser(@RequestBody User user){
        // User user = new User("bin","123");


        userService.save(user);
        return user;
    }

}
