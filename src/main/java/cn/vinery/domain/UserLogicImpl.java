/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vinery.domain.dao.MstUserMapper;
import cn.vinery.domain.dto.User;
import cn.vinery.exception.RepeatException;
import cn.vinery.util.EncryptUtil;

/**
 * 用户实现类
 */
@Service
public class UserLogicImpl implements UserLogic {

	@Autowired
	private MstUserMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.domain.User#getUser(java.lang.String, java.lang.String)
	 */
	@Override
	public User getUser(String email, String password) {
		return this.mapper.selectByEmailAndPs(email, EncryptUtil.encrypt(password, null));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.domain.User#getUser(java.lang.Integer)
	 */
	@Override
	public User getUser(Integer id) {
		return this.mapper.selectByPrimaryKey(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.domain.UserLogic#update(cn.vinery.domain.dto.User)
	 */
	@Override
	public void update(User user) throws RepeatException {
		Integer count = this.mapper.countByIdAndEmail(user.getId(), user.getEmail());
		if (count > 0) {
			throw new RepeatException("email.repeat.error");
		}

		user.setUpdateDate(new Timestamp(System.currentTimeMillis()));
		this.mapper.updateByPrimaryKey(user);
	}

}
