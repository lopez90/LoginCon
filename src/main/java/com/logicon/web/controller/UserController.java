package com.logicon.web.controller;

import com.logicon.dto.Address;

import com.logicon.service.impl.UserServiceImpl;
import com.logicon.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

/**
 * Created by Dom on 16.06.2016.
 */
@Controller
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping(value="add",method= RequestMethod.GET)
    public String addUserSetupForm(Model model){
        UserService userService = new UserServiceImpl();
        model.addAttribute("userService",userService);
        return "addUser";
    }


    @RequestMapping(value="add",method= RequestMethod.POST)
    public String addUserSubmitForm(@ModelAttribute("userService") UserService userService, @RequestParam("name") String name,
                                    @RequestParam("surname") String surname,@RequestParam("birthdate") LocalDate birthdate,
                                    @RequestParam("email") String email){
        userService.createUser(name,surname,birthdate,email);
        return "redirect:www.onet.pl";
    }

}
