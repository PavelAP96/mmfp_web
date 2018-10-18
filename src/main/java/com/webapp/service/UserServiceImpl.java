package com.webapp.service;

import com.webapp.dao.UserDao;
import com.webapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
