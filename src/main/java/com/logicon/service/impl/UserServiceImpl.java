package com.logicon.service.impl;

import com.logicon.dao.UserDAO;
import com.logicon.dto.User;
import com.logicon.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Dom on 18.06.2016.
 */
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void register(User user) {
        userDAO.add(user);
    }
}
