/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import cn.vinery.Constants;

/**
 * 注册页面
 */
public class RegisterController {

	/**
	 * 进入注册页面
	 * 
	 * @return
	 */
	@RequestMapping("register")
	public String login() {
		return Constants.REGISTER;
	}

}
