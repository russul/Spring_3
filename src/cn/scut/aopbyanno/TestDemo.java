package cn.scut.aopbyanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestDemo {
	@Test
	public void fun(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		Book book=(Book)context.getBean("book");
		book.show();
	}
}
