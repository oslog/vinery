/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import cn.vinery.exception.RepeatException;
import cn.vinery.web.form.AccountForm;

/**
 * 账户服务
 */
public interface AccountService {

	/**
	 * 保存账户
	 * 
	 * @param form
	 */
	public void save(AccountForm form, Integer id) throws RepeatException;
}
