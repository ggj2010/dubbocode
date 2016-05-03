package com.ggj.myinterface.sys.bean;

import com.ggj.myinterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;


/**
 * @ClassName:DictionaryTable.java
 * @Description: 系统字典表维护  
 * @author gaoguangjin
 * @Date 2015-9-23 下午2:03:55
 */
@Getter
@Setter
public class DictionaryTable extends BaseEntity{
	private static final long serialVersionUID = 6135938623993844435L;
	// 字典名称
	private String name;
	// 字典值
	private String value;
	// 类型
	private String type;
	// 描述
	private String description;
	// 下拉框显示时候排序
	private int sort;
	
	public DictionaryTable() {
	}
	
	public DictionaryTable(String type) {
		this.type = type;
	}
}
