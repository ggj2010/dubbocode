package com.ggj.dubbo.config.spring.schema;

import com.ggj.dubbo.config.spring.schema.config.ApplicationConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/4/15 14:01
 */
@Slf4j
public class DubboNamespaceHandlerTest {

    @Test
    public void testInit() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("mydubbo.xml");
        ApplicationConfig applicationConfig = (ApplicationConfig) context.getBean("dubboApplication"); // 获取远程服务代理
        log.info("自定义xsd 打印标签"+applicationConfig.toString());
    }
}