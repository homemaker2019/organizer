package com.homemaker.organizer.dao;

import java.util.List;

import com.homemaker.organizer.entity.User;

public interface IUserDAO {
    List<User> getAllUsers();

    User getUserById(int id);
}