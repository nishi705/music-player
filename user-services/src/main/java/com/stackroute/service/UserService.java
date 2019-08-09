package com.stackroute.service;

import com.stackroute.domain.User;

import java.util.List;
//here UserService is interface
public interface UserService {
    //inside interface saveUser is method
    public User saveUser(User user);

    public User getUserById(int id);


}

