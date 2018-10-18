package com.webapp.mapper;

import com.webapp.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("ID"));
        user.setAge(resultSet.getInt("AGE"));
        user.setName(resultSet.getString("NAME"));
        user.setEmail(resultSet.getString("EMAIL"));
        return user;
    }
}
