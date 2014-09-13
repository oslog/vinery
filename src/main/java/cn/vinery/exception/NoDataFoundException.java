/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.exception;

/**
 * 没找到数据异常
 */
public class NoDataFoundException extends BusinessLogicException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param msg
	 */
	public NoDataFoundException(String msg) {
		super(msg);
	}
}
