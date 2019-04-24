package com.homemaker.organizer.controller;

import java.util.List;

import com.homemaker.organizer.entity.User;
import com.homemaker.organizer.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }
}