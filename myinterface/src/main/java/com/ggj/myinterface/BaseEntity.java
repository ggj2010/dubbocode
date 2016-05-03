package com.ggj.myinterface;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import com.ggj.myinterface.account.bean.User;
import lombok.Getter;
import lombok.Setter;


/**
 * @ClassName:BaseEntity.java
 * @Description:所有entity父类    
 * @author gaoguangjin
 * @Date 2015-9-24 上午10:43:44
 */
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = -3585903986953379399L;
	
	protected String id;
	
	// 删除标记【 0：正常】；【1：删除】
	protected char flag = '0';
	
	protected Date createDate;
	
	// 更新日期
	protected Date updateDate;
	
	// 创建者
	protected User createUser;
	// 更新者
	protected User updateUser;

	protected String remarks;
	
	/**
	 * @Description: crud保存
	 * @return:void
	 */
	public void preInsert() {
		// 不限制ID为UUID，调用setIsNewRecord()使用自定义ID
		if (id!="") {
			setId(UUID.randomUUID().toString().replaceAll("-", ""));
		}
		this.createDate = new Date();
	}

	/**
	 * @Description: crud更新
	 * @return:void
	 */
	public void preUpdate() {
		this.updateDate = new Date();
	}
}
