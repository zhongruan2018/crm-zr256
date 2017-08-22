package cn.zr.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import cn.zr.entity.Emp;

/**
 * A data access object (DAO) providing persistence and search support for Emp
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.zr.entity.Emp
 * @author MyEclipse Persistence Tools
 */
public interface EmpDAO {
	public static final Logger log = LoggerFactory.getLogger(EmpDAO.class);
	// property constants
	public static final String ENAME = "ename";
	public static final String JOB = "job";
	public static final String MGR = "mgr";
	public static final String SAL = "sal";
	public static final String COMM = "comm";

	public void save(Emp transientInstance) ;

	public void delete(Emp persistentInstance);

	public Emp findById(java.lang.Long id);

	public List<Emp> findAll();

	public void saveOrUpdate(Emp instance);

}