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
import cn.vinery.exception.RepeatException;
import cn.vinery.web.form.AccountForm;
import cn.vinery.web.form.AvatarForm;
import cn.vinery.web.form.UserForm;
import cn.vinery.web.interceptor.Security;
import cn.vinery.web.service.AccountService;

/**
 * 设置处理
 */
@Controller
public class AccountController extends VineryController {

	@Autowired
	private AccountService service;

	/**
	 * 设置首页
	 * 
	 * @return
	 */
	@RequestMapping("set/index")
	@Security
	public String account() {
		return Constants.ACCOUNT;
	}

	/**
	 * 修改账户
	 * 
	 * @return
	 */
	@RequestMapping("set/account/edit")
	@Security
	public ModelAndView editAccount(@Valid AccountForm account, BindingResult result, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView(Constants.ACCOUNT);
		if (result.hasErrors()) {
			return mav;
		}

		UserForm user = (UserForm) request.getSession().getAttribute(Constants.CURRENT_USER);
		if (user != null) {
			try {
				service.save(account, user.getId());
				user.setEmail(account.getEmail());
				user.setNickName(account.getNickName());
				user.setPhone(account.getPhone());
				mav.addObject(Constants.INFO_MSG, "save.success");
			} catch (RepeatException ex) {
				mav.addObject(Constants.ERROR_MSG, ex.getMessage());
				return mav;
			}
		}

		return mav;
	}

	/**
	 * 进入头像界面
	 * 
	 * @return
	 */
	@RequestMapping("set/avatar")
	@Security
	public String avatar() {
		return Constants.AVATAR;
	}
	
	/**
	 * 进入头像界面
	 * 
	 * @return
	 */
	@RequestMapping("set/avatar/upload")
	@Security
	public String upload(AvatarForm form) {
		
		System.out.println(form);
		return Constants.AVATAR;
	}
}
