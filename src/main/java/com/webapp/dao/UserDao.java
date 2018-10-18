package com.webapp.dao;

import com.webapp.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
