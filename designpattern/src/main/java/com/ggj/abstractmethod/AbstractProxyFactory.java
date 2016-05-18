package com.ggj.abstractmethod;

/**
 * @author:gaoguangjin
 * @date 2016/5/10 16:32
 */
public abstract class AbstractProxyFactory implements  ProxyFactory{
    public Object getProxy(Object invoker) throws Exception {
        System.out.println("子类调用父类公共方法");
        String[] invokers= (String[]) invoker;
        return getProxy(invokers[0],invokers[1]);
    }

    public abstract Object getProxy(String s, String s2) ;
}
