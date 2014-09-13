/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain;

import java.util.List;

import cn.vinery.domain.dto.Config;

/**
 * 配置信息业务对象
 */
public interface ConfigLogic {

	/**
	 * 获取全部
	 * 
	 * @return
	 */
	List<Config> getAll();
}
