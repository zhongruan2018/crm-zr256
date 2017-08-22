package cn.zr.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.zr.dao.EmpDAO;
import cn.zr.entity.Emp;

public class EmpDAOImpl extends HibernateDaoSupport implements EmpDAO{
	
	public void save(Emp transientInstance) {
		log.debug("saving Emp instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Emp persistentInstance) {
		log.debug("deleting Emp instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Emp findById(java.lang.Long id) {
		log.debug("getting Emp instance with id: " + id);
		try {
			Emp instance = (Emp) getHibernateTemplate().get("cn.zr.entity.Emp", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Emp> findAll() {
		log.debug("finding all Emp instances");
		try {
			String queryString = "from Emp";
			return (List<Emp>)getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public void saveOrUpdate(Emp instance) {
		log.debug("attaching dirty Emp instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

}