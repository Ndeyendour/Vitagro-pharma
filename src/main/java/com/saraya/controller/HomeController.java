package com.saraya.controller;

import com.saraya.model.Owners;

import com.saraya.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("username")

public class HomeController {
	//OwnerService service = new OwnerService();
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	

}
