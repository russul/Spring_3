package cn.scut.aop;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 目标类有接口时，jvm会调用基于jdk形式实现的动态代理（由beanFactory创建代理对象）JdkDynamicAopProxy.getProxy
 * @author Lenovo
 *
 */
public class TestDemo1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean1.xml");
		// 如果有接口，那么代理类和目标类会实现共同的接口，因此这里用接口类型接收创建的对象是可以的
		_Book bookProxy = (_Book) context.getBean("book1");

		bookProxy.show();
		System.out.println(bookProxy.getClass().getName());
		ProxyGeneratorUtils.writeProxyClassToHardDisk("$Proxy10","G:/$Proxy10.class",Book1.class);
	}
}
