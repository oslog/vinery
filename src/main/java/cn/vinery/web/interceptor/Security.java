/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.interceptor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 安全注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Security {

	/**
	 * 权限类型
	 * 
	 * @return
	 */
	String type() default "";

}
