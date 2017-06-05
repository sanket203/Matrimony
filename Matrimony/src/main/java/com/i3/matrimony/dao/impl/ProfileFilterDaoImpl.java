package com.i3.matrimony.dao.impl;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.criteria.Expression;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.i3.matrimony.dao.ProfileFilterDao;
import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.pojo.SessionObject;

@Component
public class ProfileFilterDaoImpl implements ProfileFilterDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<PersonalInformation> getMaleProfiles(SessionObject sessionObject) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		List<PersonalInformation> personalInfo = new LinkedList<PersonalInformation>();
		try{
			Transaction tr = session.beginTransaction();
			Criteria criteria = session.createCriteria(PersonalInformation.class);
			Criterion cond1 = Restrictions.eq("gender", "male");
			Criterion cond2 = Restrictions.lt("dateOfBirth", sessionObject.getBirthDate());
			LogicalExpression logicAnd = Restrictions.and(cond1, cond2);
			criteria.add(logicAnd);
			criteria.addOrder(Order.desc("lastLogin"));
			personalInfo = criteria.list();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return personalInfo;
	}

	@Override
	public List<PersonalInformation> getFemaleProfiles(SessionObject sessionObject) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		List<PersonalInformation> personalInfo = new LinkedList<PersonalInformation>();
		try{
			Transaction tr = session.beginTransaction();
			Criteria criteria = session.createCriteria(PersonalInformation.class);
			Criterion cond1 = Restrictions.eq("gender", "female");
			Criterion cond2 = Restrictions.gt("dateOfBirth", sessionObject.getBirthDate());
			LogicalExpression logicAnd = Restrictions.and(cond1, cond2);
			criteria.add(logicAnd);
			criteria.addOrder(Order.desc("lastLogin"));
			personalInfo = criteria.list();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return personalInfo;
	}

	@Override
	public List<PersonalInformation> getNewMaleProfiles(SessionObject sessionObject) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		List<PersonalInformation> personalInfo = new LinkedList<PersonalInformation>();
		try{
			Transaction tr = session.beginTransaction();
			Criteria criteria = session.createCriteria(PersonalInformation.class);
			Criterion cond1 = Restrictions.eq("gender", "male");
			Criterion cond2 = Restrictions.lt("dateOfBirth", sessionObject.getBirthDate());
			LogicalExpression logicAnd = Restrictions.and(cond1, cond2);
			criteria.add(logicAnd);
			criteria.addOrder(Order.desc("lastLogin"));
			personalInfo = criteria.list();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return personalInfo;
	}

	@Override
	public List<PersonalInformation> getNewFemaleProfiles(SessionObject sessionObject) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
