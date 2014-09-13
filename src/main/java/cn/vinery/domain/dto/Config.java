/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain.dto;

/**
 * 配置项
 */
public class Config {

	private String key;
	private String value;
	private String updateDate;

	/**
	 * 获取key
	 * 
	 * @return key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 设置key
	 * 
	 * @param key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 获取value
	 * 
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置value
	 * 
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 获取updateDate
	 * 
	 * @return updateDate
	 */
	public String getUpdateDate() {
		return updateDate;
	}

	/**
	 * 设置updateDate
	 * 
	 * @param updateDate
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
