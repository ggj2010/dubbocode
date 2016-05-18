package com.ggj.modules.account.serviceimp;

import com.ggj.modules.account.dao.UserInfoDao;
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
public class UserServiceImp extends CrudService<UserInfoDao, User> implements UserService {

	@Override
	public User get(String id) {
		log.info("测试分组group1 get");
		return super.get(id);
	}

	public void insert(User entity) {
		log.info("测试分组group1 insert");
		super.save(entity);
	}
}
