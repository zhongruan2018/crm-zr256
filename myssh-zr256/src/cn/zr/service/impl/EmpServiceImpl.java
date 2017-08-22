package cn.zr.service.impl;

import java.util.List;

import cn.zr.dao.EmpDAO;
import cn.zr.dao.impl.EmpDAOImpl;
import cn.zr.entity.Emp;
import cn.zr.service.EmpService;

public class EmpServiceImpl implements EmpService {

	private EmpDAO empDAO;
	
	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	public List<Emp> findAll() {
		return empDAO.findAll();
	}

	@Override
	public Emp findById(long id) {
		return empDAO.findById(id);
	}

	@Override
	public void add(Emp emp) {
		empDAO.save(emp);
	}

	@Override
	public void modify(Emp emp) {
		empDAO.saveOrUpdate(emp);
	}

	@Override
	public void remove(Emp emp) {
		empDAO.delete(emp);
	}

}
