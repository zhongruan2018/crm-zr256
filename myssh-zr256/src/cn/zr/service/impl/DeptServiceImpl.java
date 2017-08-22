package cn.zr.service.impl;

import java.util.List;

import cn.zr.dao.DeptDAO;
import cn.zr.entity.Dept;
import cn.zr.service.DeptService;

public class DeptServiceImpl implements DeptService {

	private DeptDAO deptDAO;
	
	public void setDeptDAO(DeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}

	@Override
	public List<Dept> findAll() {
		return deptDAO.findAll();
	}

	@Override
	public Dept findById(long id) {
		return deptDAO.findById(id);
	}

	@Override
	public void add(Dept dept) {
		deptDAO.save(dept);
	}

	@Override
	public void modify(Dept dept) {
		deptDAO.saveOrUpdate(dept);
	}

	@Override
	public void remove(Dept dept) {
		deptDAO.delete(dept);
	}

}
