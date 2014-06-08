/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 首页服务实现
 */
@Service
public class IndexServiceImpl implements IndexService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.vinery.service.IndexService#getLatest()
	 */
	public List<String> getLatest() {
		List<String> list = new ArrayList<String>();
		list.add("test - 1");
		list.add("test - 2");
		return list;
	}

}
