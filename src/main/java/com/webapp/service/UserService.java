package com.webapp.service;

import com.webapp.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void delete(int id);

    void save(User user);

    User getById(int id);
}
