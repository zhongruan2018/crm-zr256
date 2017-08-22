package cn.zr.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zr.dao.DeptDAO;
import cn.zr.entity.Dept;

public class TestDao {
	
	@Test
	public void testDao(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptDAO deptDAO = (DeptDAO)ac.getBean("DeptDAO");
		List<Dept> depts = deptDAO.findAll();
		for(Dept dept : depts){
			System.out.println(dept.getDname());
		}
	}

}
