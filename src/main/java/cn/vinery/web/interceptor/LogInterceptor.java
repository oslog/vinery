/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.interceptor;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.vinery.Constants;
import cn.vinery.web.form.UserForm;

/**
 * 日志拦截器
 */
public class LogInterceptor implements HandlerInterceptor {

	/** 日志 */
	private static final Logger log = LogManager.getLogger(LogInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("New access request.\n");

		UserForm uf = (UserForm) request.getSession().getAttribute(Constants.CURRENT_USER);
		if (uf != null) {
			sb.append("User ID:").append(uf.getId()).append("\n");
		}

		sb.append("Client IP:").append(request.getRemoteHost()).append(" PORT:").append(request.getRemotePort())
				.append("\n");
		sb.append("URL:").append(request.getRequestURI()).append("\n");
		Map<String, String[]> paramMap = request.getParameterMap();
		Iterator<Map.Entry<String, String[]>> iterator = paramMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, String[]> entry = iterator.next();
			sb.append(entry.getKey()).append("=");
			for (Object obj : entry.getValue()) {
				sb.append(obj).append(" ");
			}
		}

		log.debug(sb.toString());

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax
	 * .servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
