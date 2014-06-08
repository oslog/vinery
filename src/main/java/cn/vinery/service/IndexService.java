/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.service;

import java.util.List;

/**
 * 首页服务接口
 */
public interface IndexService {

	/**
	 * 获取最近的文章
	 * 
	 * @return
	 */
	public List<String> getLatest();
}
