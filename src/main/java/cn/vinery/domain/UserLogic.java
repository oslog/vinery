/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain;

import cn.vinery.domain.dto.User;
import cn.vinery.exception.RepeatException;

/**
 * 用户业务逻辑
 */
public interface UserLogic {

	/**
	 * 根据邮箱和密码获取用户
	 */
	public User getUser(String email, String password);

	/**
	 * 利用ID获取用户
	 */
	public User getUser(Integer id);

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 */
	public void update(User user) throws RepeatException;
}
