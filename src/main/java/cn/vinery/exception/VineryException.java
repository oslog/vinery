/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.exception;

/**
 * 系统异常
 */
public class VineryException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public VineryException(String msg) {
		super(msg);
	}

	public VineryException(Throwable ex) {
		super(ex);
	}

	public VineryException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
