package com.logicon.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import com.logicon.service.TextViewImpl;

/**
 * Created by Dom on 15.06.2016.
 */

@Controller
@RequestMapping("/text")

public class TextViewControler {

    TextViewImpl textViewImpl;

    @Autowired
    public void TextViewController(TextViewImpl textViewImpl)
    {
        this.textViewImpl=textViewImpl;
    }

   @RequestMapping(value="/text", method=RequestMethod.GET)
    public String welcome(Model model)
   {
       String newText= new String();
       model.addAttribute("newText",newText);
       return "Welcome";
   }

}