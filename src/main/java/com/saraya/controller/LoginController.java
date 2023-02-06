package com.saraya.controller;

import com.saraya.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//@SessionAttributes("username")
public class LoginController {

 // AuthService service = new AuthService();

    @RequestMapping("/")
    public String login(){
        return "index";
    }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username
          , @RequestParam String password, ModelMap model){
      if (username.equals("ndeye")&& password.equals("secret")){
      	model.addAttribute("username",username);
          return "redirect:home";
      }else {
          return "index";
      }
    }
}