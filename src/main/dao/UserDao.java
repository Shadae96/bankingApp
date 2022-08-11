package com.example.dao;

import java.util.List;

import com.example.models.Users;
import com.example.store.Store;


public interface UserDao {

    List <User> getAllUsers();

    User getUserByUsername(String username);

    void createUser (User user);
    
}
