/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.exception;

/**
 * 邮箱地址重复异常
 */
public class RepeatException extends BusinessLogicException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public RepeatException(String msg) {
		super(msg);
	}

	public RepeatException(Throwable ex) {
		super(ex);
	}

	public RepeatException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
