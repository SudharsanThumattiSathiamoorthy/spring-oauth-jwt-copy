package com.example.sudhar.springoauthjwt.service;

import com.example.sudhar.springoauthjwt.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}