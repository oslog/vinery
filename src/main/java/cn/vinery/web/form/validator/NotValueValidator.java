/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.web.form.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cn.vinery.util.StringUtil;

/**
 * 不为空验证
 */
public class NotValueValidator implements ConstraintValidator<NotValue, Object> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.validation.ConstraintValidator#initialize(java.lang.annotation.
	 * Annotation)
	 */
	@Override
	public void initialize(NotValue constraintAnnotation) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
	 * javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if (value != null) {
			return StringUtil.nonEmpty(value.toString().replaceAll("　", "").trim());
		}

		return false;
	}

}
