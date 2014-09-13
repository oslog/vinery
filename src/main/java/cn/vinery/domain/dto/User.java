/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain.dto;

import java.sql.Timestamp;

/**
 * 用户对象
 */
public class User {

	/** ID */
	private Integer id;
	/** 邮箱地址 */
	private String email;
	/** 昵称 */
	private String nickName;
	/** 密码 */
	private String password;
	/** 角色ID */
	private Integer rid;
	/** 手机号码 */
	private String phone;
	/** 性别 */
	private Integer sexual;
	/** 当前状态 */
	private Integer status;
	/** 格言 */
	private String maxim;
	/** 更新时间 */
	private Timestamp updateDate;
	/** 创建时间 */
	private Timestamp createDate;

	/**
	 * 获取id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * 获取password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取rid
	 * 
	 * @return rid
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * 设置rid
	 * 
	 * @param rid
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
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

	/**
	 * 获取sexual
	 * 
	 * @return sexual
	 */
	public Integer getSexual() {
		return sexual;
	}

	/**
	 * 设置sexual
	 * 
	 * @param sexual
	 */
	public void setSexual(Integer sexual) {
		this.sexual = sexual;
	}

	/**
	 * 获取status
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置status
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取maxim
	 * 
	 * @return maxim
	 */
	public String getMaxim() {
		return maxim;
	}

	/**
	 * 设置maxim
	 * 
	 * @param maxim
	 */
	public void setMaxim(String maxim) {
		this.maxim = maxim;
	}

	/**
	 * 获取updateDate
	 * 
	 * @return updateDate
	 */
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	/**
	 * 设置updateDate
	 * 
	 * @param updateDate
	 */
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 获取createDate
	 * 
	 * @return createDate
	 */
	public Timestamp getCreateDate() {
		return createDate;
	}

	/**
	 * 设置createDate
	 * 
	 * @param createDate
	 */
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
}
