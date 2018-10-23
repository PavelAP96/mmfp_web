package com.webapp.dao;

import com.webapp.entity.User;
import com.webapp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    public final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM user", new UserMapper());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE ID=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO user (NAME, EMAIL, AGE) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET NAME = ?, EMAIL = ?, AGE = ? WHERE ID = ?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE ID = ?";
        jdbcTemplate.update(sql, id);
    }
}