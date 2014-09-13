/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vinery.domain.UserLogic;
import cn.vinery.domain.dto.User;
import cn.vinery.exception.RepeatException;
import cn.vinery.web.form.AccountForm;

/**
 * 账户服务实现
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private UserLogic logic;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.vinery.web.service.AccountService#save(cn.vinery.web.form.AccountForm)
	 */
	@Override
	public void save(AccountForm form, Integer id) throws RepeatException {
		User user = this.logic.getUser(id);
		user.setNickName(form.getNickName());
		user.setEmail(form.getEmail());
		user.setPhone(form.getPhone());

		this.logic.modify(user);
	}

}
