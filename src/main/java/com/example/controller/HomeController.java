package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.service.UserService;

@Controller
public class HomeController {
	
	@Autowired UserService userService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<User> users = userService.findAll();
		model.addAttribute("msg", "Hi!!!");
		model.addAttribute("users", users);
		return "index";
	}
	
}
