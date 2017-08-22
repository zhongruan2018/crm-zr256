package cn.zr.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.zr.entity.Dept;
import cn.zr.service.DeptService;

public class DeptAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//与页面传值实现的注入方式，采用的是struts2的IoC
	private List<Dept> depts;
	//需要注入的是service，通过Spring的IoC注入
	private DeptService deptService;
	
	public String showAll(){
		depts = deptService.findAll();
		return SUCCESS;
	}

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
	
}








