/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vinery.domain.dao.MstConfigMapper;
import cn.vinery.domain.dto.Config;

/**
 * 获取全部
 */
@Service
public class ConfigLogicImpl implements ConfigLogic {

	/** 数据操作对象 */
	@Autowired
	private MstConfigMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.domain.ConfigLogic#getAll()
	 */
	@Override
	public List<Config> getAll() {
		return mapper.selectAll();
	}

}
