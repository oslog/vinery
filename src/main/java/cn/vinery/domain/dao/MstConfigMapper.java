/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.vinery.domain.dto.Config;

/**
 * 配置表关系对象映射
 */
@Repository
public interface MstConfigMapper extends Mapper<Config> {

	/**
	 * 获取全部数据
	 * 
	 * @return
	 */
	List<Config> selectAll();
}
