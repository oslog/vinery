/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.util;

/**
 * 字符串工具类
 */
public class StringUtil {

	/**
	 * 是否为空
	 * 
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(String arg) {
		return arg == null || "".equals(arg);
	}

	/**
	 * 是否非空
	 * 
	 * @param arg
	 * @return
	 */
	public static boolean nonEmpty(String arg) {
		return isEmpty(arg) == false;
	}

}
