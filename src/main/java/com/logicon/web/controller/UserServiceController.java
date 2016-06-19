package com.logicon.web.controller;

import com.logicon.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dom on 18.06.2016.
 */

@Controller
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    //nananan

    @RequestMapping(value = "/add")
    public String showAddUserPage(Model model){
        return "add";
    }

    @RequestMapping(value = "/added", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
    public String addUser(@RequestBody json json)
    {
        userServiceImpl.register(results);
        return "add";
    }
}
