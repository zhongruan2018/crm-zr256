package cn.zr.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.zr.dao.DeptDAO;
import cn.zr.entity.Dept;

/**
 * A data access object (DAO) providing persistence and search support for Dept
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.zr.entity.Dept
 * @author MyEclipse Persistence Tools
 */
public class DeptDAOImpl extends HibernateDaoSupport implements DeptDAO {

	//通过Spring IoC容器创建并注入到dao中
	//private SessionFactory sessionFactory;

	/*
	 * 通过setter设置器注入sessionFactory
	 * 由HibernateDaoSuppprt完成注入方法？
	 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//获取session的方法
	private Session getHibernateTemplate() {
		return sessionFactory.getHibernateTemplate();
	}
	protected void initDao() {
		// do nothing
	}
	*/

	public void save(Dept transientInstance) {
		log.debug("saving Dept instance");
		try {
			//getHibernateTemplate().save(transientInstance);
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dept persistentInstance) {
		log.debug("deleting Dept instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dept findById(java.lang.Long id) {
		log.debug("getting Dept instance with id: " + id);
		try {
			Dept instance = (Dept) getHibernateTemplate().get("cn.zr.entity.Dept", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Dept> findAll() {
		log.debug("finding all Dept instances");
		try {
			//String queryString = "from Dept";
			//return (List<Dept>) getHibernateTemplate().find(queryString);
			//return queryObject.list();
			DetachedCriteria dc = DetachedCriteria.forClass(Dept.class);
			return (List<Dept>)getHibernateTemplate().findByCriteria(dc);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			//tx.rollback();
			throw re;
		}
	}

	public void saveOrUpdate(Dept instance) {
		log.debug("attaching dirty Dept instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

}