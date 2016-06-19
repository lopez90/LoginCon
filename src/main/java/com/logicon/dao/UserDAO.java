package com.logicon.dao;

import com.logicon.dto.User;

/**
 * Created by Dom on 18.06.2016.
 */
public class UserDAO {



    public User add (String aName, String aPassword, String aEmail){

        User user = new User();
        user.setName(aName);
        user.setPassword(aPassword);
        user.setEmail(aEmail);

        return user;
    }

}
