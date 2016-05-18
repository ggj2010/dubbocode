package com.ggj.abstractmethod;

/**
 * @author:gaoguangjin
 * @date 2016/5/10 16:22
 */
public interface ProxyFactory {
    Object getProxy(Object invoker) throws Exception;

    Object getInvoker(String s, String s2, Object object) throws Exception;

}
