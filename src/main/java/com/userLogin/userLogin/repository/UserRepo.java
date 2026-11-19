package com.userLogin.userLogin.repository;

import com.userLogin.userLogin.model.CustomerUser;

public interface UserRepo {
    void createUser(CustomerUser user);
    CustomerUser findUserByUsername(String username);
}
