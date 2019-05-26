package com.vldrospuskov.simpledockercrudapp.controller;

import com.vldrospuskov.simpledockercrudapp.entity.User;
import com.vldrospuskov.simpledockercrudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}