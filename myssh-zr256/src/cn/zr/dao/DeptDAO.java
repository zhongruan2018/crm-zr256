package cn.zr.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.zr.entity.Dept;

public interface DeptDAO {
	public static final Logger log = LoggerFactory.getLogger(DeptDAO.class);
	// property constants
	public static final String DNAME = "dname";
	public static final String LOC = "loc";

	public void save(Dept transientInstance);

	public void delete(Dept persistentInstance);

	public Dept findById(java.lang.Long id);

	public List<Dept> findAll();

	public void saveOrUpdate(Dept instance);

}