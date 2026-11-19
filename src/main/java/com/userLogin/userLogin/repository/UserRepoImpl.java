package com.userLogin.userLogin.repository;

import com.userLogin.userLogin.model.CustomerUser;
import com.userLogin.userLogin.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements UserRepo {
    private static final String USER_TABLE_NAME = "users";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(CustomerUser user) {
        String sql = "INSERT INTO " + USER_TABLE_NAME +
                " (username, password, roles, permissions)" +
                " VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(
                sql,
                user.getUsername(),
                user.getPassword(),
                user.getRoles(),
                user.getPermissions()
        );
    }

    @Override
    public CustomerUser findUserByUsername(String username) {
        String sql = "SELECT * FROM " + USER_TABLE_NAME + " WHERE username = ?";
        try {
            return jdbcTemplate.queryForObject(
                    sql,
                    new UserMapper(),
                    username
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
