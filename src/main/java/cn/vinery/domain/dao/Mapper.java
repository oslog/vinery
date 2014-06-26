/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.domain.dao;

/**
 * 关系对象映射接口
 */
public interface Mapper<T> {

	/**
	 * 根据主键查询数据
	 * 
	 * @param id
	 * @return
	 */
	T selectByPrimaryKey(Integer id);

	/**
	 * 根据主键删除数据
	 * 
	 * @param id
	 */
	void deleteByPrimaryKey(Integer id);

	/**
	 * 新增数据
	 * 
	 * @param record
	 */
	void insert(T record);

	/**
	 * 新增数据，仅保存有数据的字段
	 * 
	 * @param record
	 */
	void insertSelective(T record);

	/**
	 * 根据主键更新数据
	 * 
	 * @param record
	 */
	void updateByPrimaryKey(T record);

	/**
	 * 根据主键更新数据，仅更新有数据的字段
	 * 
	 * @param record
	 */
	void updateByPrimaryKeySelective(T record);
}
