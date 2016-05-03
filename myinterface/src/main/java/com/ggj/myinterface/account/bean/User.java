package com.ggj.myinterface.account.bean;

import java.util.Date;

import com.ggj.myinterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class User extends BaseEntity {
	
	private static final long serialVersionUID = -8131486642652154706L;
	private String email;
	
	private String name;
	private String password;
	private String salt;
	private int age;
	private char sex;
	// 注册日期
	private Date registerDate;
	// 最后登录时间
	private Date lastLoginDate;
	// 是否是黑名单
	private char isBlacklist = '0';
	// 是否邮箱激活
	private char isActive;
	
	// 是否保存密码到cookie
	private boolean rememberMe;

	//头像照片地址
	private String image;
	public User(String email) {
		this.email = email;
	}
	
	public User() {
	}
	
	public String toString() {
		return "email:" + email + "==" + "name" + name;
	}
}
