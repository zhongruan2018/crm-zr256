package cn.zr.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zr.entity.Dept;
import cn.zr.service.DeptService;

public class TestService {
	
	@Test
	public void testService(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptService deptService = (DeptService)ac.getBean("deptService");
		List<Dept> depts = deptService.findAll();
		for(Dept dept : depts){
			System.out.println(dept.getDname());
		}
	
	}

}
