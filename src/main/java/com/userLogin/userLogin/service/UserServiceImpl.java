package com.userLogin.userLogin.service;

import com.userLogin.userLogin.model.CustomerUser;
import com.userLogin.userLogin.model.CustomerUserRequest;
import com.userLogin.userLogin.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public void createUser(CustomerUserRequest customerUserRequest) throws Exception {
        CustomerUser existingUser = userRepo.findUserByUsername(customerUserRequest.getUsername());
        if (existingUser != null) {
            throw new Exception("Username: " + customerUserRequest.getUsername() + " already exists");
        }
        userRepo.createUser(customerUserRequest.toCustomerUser());
    }

    @Override
    public CustomerUser findUserByUsername(String username) {
        return userRepo.findUserByUsername(username);
    }
}
