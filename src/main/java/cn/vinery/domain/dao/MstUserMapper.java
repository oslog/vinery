/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.vinery.domain.dto.User;

/**
 * 用户表关系对象映射
 */
@Repository
public interface MstUserMapper extends Mapper<User> {

	/**
	 * 根据邮箱地址和密码查询数据
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	User selectByEmailAndPs(@Param("email") String email, @Param("password") String password);

	/**
	 * 检查除指定id外是否存在相同邮箱地址的数据
	 * 
	 * @param id
	 * @param email
	 * @return
	 */
	Integer countByIdAndEmail(@Param("id") Integer id, @Param("email") String email);
}
