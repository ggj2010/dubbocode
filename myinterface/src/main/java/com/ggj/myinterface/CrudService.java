package com.ggj.myinterface;


import java.util.List;

/**
 * @ClassName:CrudService.java
 * @Description:  增删改基础service  
 * @author gaoguangjin
 * @Date 2015-9-24 下午5:24:45
 */

public interface  CrudService<T> {
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity);

	/**
	 * 获取单条数据
	 * @return
	 */
	public T get(String id);

	/**
	 * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);


	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public void insert(T entity);

	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public void update(T entity);

	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 * @param entity
	 * @return
	 */
	public void delete(T entity);
	
}
