/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.vinery.Constants;
import cn.vinery.exception.NoDataFoundException;
import cn.vinery.web.form.UserForm;
import cn.vinery.web.service.LoginService;

/**
 * 登录处理
 */
@Controller
public class LoginController extends VineryController {

	/** 登录服务 */
	@Autowired
	private LoginService service;

	/**
	 * 进入登录页面
	 * 
	 * @return
	 */
	@RequestMapping("login")
	public String login() {
		return Constants.LOGIN;
	}

	/**
	 * 登录系统
	 * 
	 * @param user
	 * @param result
	 * @param request
	 * @return
	 */
	@RequestMapping("login/enter")
	public ModelAndView enter(@Valid UserForm user, BindingResult result, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		if (result.hasErrors()) {
			mav.setViewName(Constants.LOGIN);
			return mav;
		}

		try {
			request.getSession().setAttribute(Constants.CURRENT_USER, service.login(user));
		} catch (NoDataFoundException ex) {
			mav.setViewName(Constants.LOGIN);
			mav.addObject(Constants.ERROR_MSG, "user.not.exist");
			return mav;
		}

		mav.setViewName(Constants.REDIRECT);
		return mav;
	}
}
