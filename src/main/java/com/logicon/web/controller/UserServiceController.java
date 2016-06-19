package com.logicon.web.controller;

import com.logicon.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

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

    private static void addUser(String aName, String aPassword,String aEmail) {
        final String uri = "http://localhost:8080/user/added";

        UserServiceImpl newUser = new UserServiceImpl(aName,aPassword,aEmail);
        RestTemplate restTemplate = new RestTemplate();
        UserServiceImpl results = restTemplate.postForObject( uri, newUser , UserServiceImpl.class);

        System.out.println(results);
    }

    @RequestMapping(value = "/added", method = RequestMethod.POST)
    public String addUser(@RequestBody UserServiceImpl results)
    {
        userServiceImpl.register(results);
        return "add";
    }
}
