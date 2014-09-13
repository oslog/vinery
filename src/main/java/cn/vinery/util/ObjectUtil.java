/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.util;

import java.util.List;

/**
 * 对象工具类
 */
public class ObjectUtil {

	public static boolean isEmpty(List<?> list) {
		return list == null || list.isEmpty();
	}
}
