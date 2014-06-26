/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import cn.vinery.exception.NoFindDataException;
import cn.vinery.web.form.UserForm;

/**
 * 登录服务
 */
public interface LoginService {

	/**
	 * 登录系统
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	UserForm login(UserForm userForm) throws NoFindDataException;
}
