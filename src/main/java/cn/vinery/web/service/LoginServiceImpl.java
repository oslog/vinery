/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vinery.domain.UserLogic;
import cn.vinery.domain.dto.User;
import cn.vinery.exception.NoDataFoundException;
import cn.vinery.web.form.UserForm;

/**
 * 登录系统实现类
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserLogic logic;

	/**
	 * 登录
	 */
	@Override
	public UserForm login(UserForm userForm) throws NoDataFoundException {
		User user = logic.getUser(userForm.getEmail(), userForm.getPassword());

		if (user == null) {
			throw new NoDataFoundException("user.not.exist");
		}

		userForm.setId(user.getId());
		userForm.setNickName(user.getNickName());
		userForm.setPhone(user.getPhone());
		userForm.setSexual(user.getSexual());
		userForm.setStatus(user.getStatus());
		userForm.setMaxim(user.getMaxim());

		return userForm;
	}
}
