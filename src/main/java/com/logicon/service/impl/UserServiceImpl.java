package com.logicon.service.impl;

import com.logicon.dao.UserDAO;
import com.logicon.service.interf.IUserService;

/**
 * Created by Dom on 18.06.2016.
 */
public class UserServiceImpl implements IUserService {

    private UserDAO userDAO = new UserDAO();

    @Override
    public void register(String aName, String aPassword, String aEmail) {

        userDAO.add(aName,aPassword,aEmail);
    }

}
