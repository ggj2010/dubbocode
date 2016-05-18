package com.ggj.myinterface.account.serviceimp;

import com.ggj.myinterface.account.bean.User;
import com.ggj.myinterface.account.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/4/18 9:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"})
@Slf4j
public class UserServiceImpTest  {

    @Qualifier("userServiceImp")
    @Autowired
    private UserService userService;


    @Test
    public void testGet() throws Exception {
        User user = userService.get("1");
        log.info("==="+user.toString());
    }


    @Test
    public void testFindList() throws Exception {
       // userService.findList(new User());
    }

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }
}