package com.zxcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxcf.core.entity.Logininfo;
import com.zxcf.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public Logininfo tets1() {
		Logininfo obj = userService.findAll();
		return obj;
	}
	
	@RequestMapping("/test")
	public String tets2() {
		
		return "index";
	}
}
