package com.ggj.modules.account.serviceimp;

import com.ggj.modules.account.dao.UserDao;
import com.ggj.modules.crud.CrudService;
import com.ggj.myinterface.account.bean.User;
import com.ggj.myinterface.account.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/4/15 16:59
 */
@Service
@Slf4j
@Transactional(readOnly = true)
public class UserServiceImp extends CrudService<UserDao, User> implements UserService {
	
	public User get(User entity) {
		return super.get(entity);
	}
	
	public User get(String id) {
		return super.get(id);
	}
	
	public List<User> findList(User entity) {
		return super.findList(entity);
	}
	
	public void insert(User entity) {
		super.save(entity);
	}
	
	public void update(User entity) {
		super.save(entity);
	}
	
	public void delete(User entity) {
		super.delete(entity);
	}
}
