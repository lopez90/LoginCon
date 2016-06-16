package com.logicon.service.impl;

import com.logicon.dto.Address;
import com.logicon.dto.User;
import com.logicon.service.interf.UserService;

import java.time.LocalDate;

/**
 * Created by Dom on 16.06.2016.
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl(){

    }

    @Override
    public User createUser(String name, String surname, LocalDate birthdate, String email) {

        User newUser= new User(name,surname,birthdate,email);
        return newUser;
    }
}
