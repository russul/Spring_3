package cn.scut.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	
	//当目标资源没有实现接口，这时候jvm会调用CGLIB库，将目标类的一个子类作为他的动态代理类，这时候接收对象就用目标类型即可
	@Test
	public void fun(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Book book=(Book)context.getBean("book");
		book.show();
		System.out.println(book.getClass().getName());
	}
}
