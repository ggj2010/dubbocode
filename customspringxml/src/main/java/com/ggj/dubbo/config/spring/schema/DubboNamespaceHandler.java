package com.ggj.dubbo.config.spring.schema;

import com.ggj.dubbo.config.spring.schema.config.ApplicationConfig;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.w3c.dom.Element;

/**
 * @author:gaoguangjin
 * @Description: 自定义解析
 * @Email:335424093@qq.com
 * @Date 2016/4/15 10:59
 */
public class DubboNamespaceHandler extends NamespaceHandlerSupport {
	
	/**
	 * 检查重复的jar包 
	 */
	static {
		Version.checkDuplicate(DubboNamespaceHandler.class);
	}

	/**
	 * dubbo配置参考手册：http://dubbo.io/User+Guide-zh.htm#UserGuide-zh-%E9%85%8D%E7%BD%AE%E5%8F%82%E8%80%83%E6%89%8B%E5%86%8C
	 */
	public void init() {
		//我们自己实现的简单初始化类
	//	registerBeanDefinitionParser("application", new InnerApplicationBeanDefinitionParser());

		//dubbo封装的实现加载配置项注册到springbean 可以下个断点学习下
		registerBeanDefinitionParser("application", new DubboBeanDefinitionParser(ApplicationConfig.class, true));
	}
	
	/**
	 * 匿名类解析，继承AbstractSingleBeanDefinitionParser  解析过程没有自己定义。
	 */
	private class InnerApplicationBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
		protected Class getBeanClass(Element element) {
			return ApplicationConfig.class;
		}
		
		/**
		 * 解析方法不通用
		 * @param element
		 * @param builder
		 */
		@Override
		protected void doParse(Element element, BeanDefinitionBuilder builder) {
            //TODO 省略了参数的校验 和默认值的赋值，还有利用反射
			String name = element.getAttribute("name");
			builder.addPropertyValue("name", name);
			
			String version = element.getAttribute("version");
			builder.addPropertyValue("version", version);

			String owner = element.getAttribute("owner");
			builder.addPropertyValue("owner", version);
		}
	}
}
