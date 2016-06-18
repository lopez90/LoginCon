package com.logicon.web.controller;


import com.logicon.dto.User;
import com.logicon.service.impl.UserServiceImpl;
import com.logicon.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Dom on 18.06.2016.
 */

@Controller
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/add")
    public String showAddUserPage(Model model){
        return "add";
    }

    @RequestMapping("/added")
    public String addUser(Model model, @RequestParam("name") String name, @RequestParam("password") String password,
                          @RequestParam("email") String email){
        iUserService.register(name,password,email);
        return "added";
    }
}
