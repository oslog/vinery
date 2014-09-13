/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery;

/**
 * 常量
 */
public interface Constants {

	/** 返回前台的值 */
	String FORWARD = "forward:/";
	String REDIRECT = "redirect:/";
	String INDEX = "index";
	String LOGIN = "login";
	String REGISTER = "register";
	String ACCOUNT = "account";
	String AVATAR = "avatar";

	/** 当前登录的用户KEY */
	String CURRENT_USER = "currentUser";
	
	/** 配置信息KEY */
	String CONFIG_KEY = "systemConfig";

	/** 错误信息KEY */
	String ERROR_MSG = "errorMsg";
	/** 消息信息KEY */
	String INFO_MSG = "infoMsg";
}
