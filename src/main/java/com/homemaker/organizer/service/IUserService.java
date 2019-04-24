package com.homemaker.organizer.service;

import java.util.List;

import com.homemaker.organizer.entity.User;

public interface IUserService {

    List<User> getAllUsers();

    User getUserById(int id);
}