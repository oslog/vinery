/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.form;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import cn.vinery.web.form.validator.NotValue;

/**
 * 账户信息
 */
public class AccountForm {

	/** 昵称 */
	@NotValue
	@Length(min = 2, max = 20)
	private String nickName;
	/** 邮箱 */
	@NotValue
	@Email
	private String email;
	/** 手机 */
	@Pattern(regexp = "^[1][3,4,5,8][0-9]{9}$")
	private String phone;

	/**
	 * 获取nickName
	 * 
	 * @return nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * 设置nickName
	 * 
	 * @param nickName
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 获取email
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取phone
	 * 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置phone
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
