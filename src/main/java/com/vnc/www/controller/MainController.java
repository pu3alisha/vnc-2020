package com.vnc.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "pages/register";
	}
	
	@RequestMapping("/forgotPassword")
	public String forgotPassword() {
		return "pages/forgotPassword";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "pages/dashboard";
	}

	@RequestMapping("/shareCard")
	public String shareCard() {
		return "pages/shareCard";
	}
	
	@RequestMapping("/userView")
	public String userView() {
		return "pages/userView";
	}
	
	@RequestMapping("/userView1")
	public String userView1() {
		return "pages/userView1";
	}
	
	@RequestMapping("/userView2")
	public String userView2() {
		return "pages/userView2";
	}
	@RequestMapping("/product")
	public String listProduct() {
		return "pages/product";
	}
	
}
