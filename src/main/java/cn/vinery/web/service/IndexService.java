/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.service;

import java.util.List;

import cn.vinery.rss.Rss;

/**
 * 首页服务接口
 */
public interface IndexService {

	/**
	 * 获取最近的文章
	 * 
	 * @return
	 */
	public List<Rss> getLatest();
}
