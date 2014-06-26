/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.exception;


/**
 * 业务逻辑异常
 */
public class BusinessLogicException extends VineryException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public BusinessLogicException(String msg) {
		super(msg);
	}

	public BusinessLogicException(Throwable ex) {
		super(ex);
	}

	public BusinessLogicException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
