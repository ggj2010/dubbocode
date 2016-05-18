package com.ggj.modules.crud;

import java.util.List;

/**
 * @ClassName:CrudDao.java
 * @Description:    DAO支持类实现
 * @author gaoguangjin
 * @Date 2015-9-3 下午2:02:26
 */
public interface CrudDao<T> {
	
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
	public int insert(T entity);

	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int update(T entity);

	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 * @param entity
	 * @return
	 */
	public int delete(T entity);

}