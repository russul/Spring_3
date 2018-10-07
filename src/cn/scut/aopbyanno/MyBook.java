package cn.scut.aopbyanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


//增强对象
@Aspect
public class MyBook {
	@Before(value="execution(* cn.scut.aopbyanno.Book.*(..))")
	public void before(){
		System.out.println("mybook.......");
	}
}
