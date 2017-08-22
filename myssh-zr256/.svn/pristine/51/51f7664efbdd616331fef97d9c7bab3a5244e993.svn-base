package cn.zr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	
	//创建调用IoC容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testref(){ 
		//使用IoC/DI控制反转 来完成对象中数据的依赖注入
		TestPrint tp = (TestPrint) ac.getBean("testprinter");
	    tp.testPrinter();
	    
	    //没有通过容器，直接用面向对象的方法进行调用，对象中的数据为空
	    /*TestPrint tpnew = (TestPrint) ac.getBean("testprinter");
	    tpnew.testPrinter();*/
	}
}
