/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.vinery.Constants;
import cn.vinery.domain.ConfigLogic;
import cn.vinery.domain.dto.Config;
import cn.vinery.util.ObjectUtil;

/**
 * 系统启动和关闭监听
 */
public class SystemListener implements ServletContextAware {

	@Autowired
	private ConfigLogic logic;

	private ServletContext servletContext;

	/**
	 * 系统关闭
	 */
	public void destroyed() {
		// TODO Auto-generated method stub

	}

	/**
	 * 系统启动
	 */
	public void initialized() {
		List<Config> list = logic.getAll();

		if (ObjectUtil.isEmpty(list) == false) {
			Map<String, String> map = new HashMap<String, String>();
			for (Config c : list) {
				map.put(c.getKey(), c.getValue());
			}
			this.servletContext.setAttribute(Constants.CONFIG_KEY, map);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.context.ServletContextAware#setServletContext
	 * (javax.servlet.ServletContext)
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
}
