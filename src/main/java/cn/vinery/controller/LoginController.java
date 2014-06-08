/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 登录处理
 */
@Controller
public class LoginController extends VineryController {

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("enter")
	public String enter(@RequestParam("email") String name,
			@RequestParam("password") String password) {
		
//		System.out.println(name);
//		System.out.println(password);
		return "index";
	}
}
