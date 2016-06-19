package com.logicon.service.impl;

import com.logicon.dao.UserDAO;
import com.logicon.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Dom on 18.06.2016.
 */
public class UserServiceImpl implements IUserService {

    String name;
    String password;
    String email;

    @Autowired
    private UserDAO userDAO;

    @Override
    public void register(UserServiceImpl newUser) {

        this.name=newUser.name;
        this.password=newUser.password;
        this.email=newUser.email;
        userDAO.add(name,password,email);
    }

    public UserServiceImpl(String aName, String aPassword,String aEmail){
        this.name=aName;
        this.password=aPassword;
        this.email=aEmail;
    }

    public UserServiceImpl(){

    }

}
