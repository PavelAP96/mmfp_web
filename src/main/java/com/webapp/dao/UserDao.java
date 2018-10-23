package com.webapp.dao;

import com.webapp.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User getById(int id);

    void save(User user);

    void delete(int id);

    void update(User user);
}
