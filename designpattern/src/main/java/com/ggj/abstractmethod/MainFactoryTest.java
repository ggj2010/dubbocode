package com.ggj.abstractmethod;

/**
 * @author:gaoguangjin
 * @date 2016/5/10 16:50
 */
public class MainFactoryTest {
    public static void main(String[] args) throws Exception {
        new JdkProxyFactory().getProxy(new String[]{"JdkProxyFactory","2"});
    }
}
