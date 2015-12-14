package com.model;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Info
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see test.model.Info
 * @author MyEclipse Persistence Tools
 */
public class InfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(InfoDAO.class);
	// property constants
	public static final String PASSWORD = "password";
	public static final String USER_NAME="userName";
	public static final String PHONE_NUM = "phoneNum";

	@Override
	protected void initDao() {
		// do nothing
	}

	public void save(Info transientInstance) {
		log.debug("saving Info instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Info persistentInstance) {
		log.debug("deleting Info instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Info findById(java.lang.Integer id) {
		log.debug("getting Info instance with id: " + id);
		try {
			Info instance = (Info) getHibernateTemplate().get(
					"com.model.Info", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Info instance) {
		log.debug("finding Info instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Info instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Info as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}
	public List findByUserName(Object username){
		return findByProperty(USER_NAME, username);
	}
	public List findByPhoneNum(Object phoneNum) {
		return findByProperty(PHONE_NUM, phoneNum);
	}

	public List findAll() {
		log.debug("finding all Info instances");
		try {
			String queryString = "from Info";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Info merge(Info detachedInstance) {
		log.debug("merging Info instance");
		try {
			Info result = (Info)getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Info instance) {
		log.debug("attaching dirty Info instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Info instance) {
		log.debug("attaching clean Info instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static InfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (InfoDAO) ctx.getBean("InfoDAO");
	}
}