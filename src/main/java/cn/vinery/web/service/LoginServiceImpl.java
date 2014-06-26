/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vinery.domain.UserLogic;
import cn.vinery.exception.NoFindDataException;
import cn.vinery.web.form.UserForm;

/**
 * 登录系统实现类
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserLogic logic;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.service.LoginService#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public UserForm login(UserForm userForm) throws NoFindDataException {
		return new UserForm(logic.getUser(userForm.getEmail(), userForm.getPassword()));
	}
}
