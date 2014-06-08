/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.bbs.service;

import java.util.List;

/**
 * 首页服务
 */
public interface IndexService {

	/**
	 * 获取最近的文章
	 * 
	 * @return
	 */
	public List<String> getLatest();
}
