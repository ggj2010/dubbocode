package com.ggj.abstractmethod;

/**
 * @author:gaoguangjin
 * @date 2016/5/10 16:44
 */
public class JavasistProxyFactory extends AbstractProxyFactory{

    @Override
    public Object getProxy(String s, String s2) {
        System.out.println("JavasistProxyFactory 获取proxy");
        return null;
    }

    public Object getInvoker(String s, String s2, Object object) throws Exception {
        System.out.println("JavasistProxyFactory getInvoker");
        return null;
    }
}
