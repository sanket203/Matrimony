package com.i3.matrimony.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.i3.matrimony.dao.PersonalInfoDao;
import com.i3.matrimony.model.PersonalInformation;

@Component
public class PersonalInfoDaoImpl implements PersonalInfoDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addPersonalInfo(PersonalInformation personalinfo) throws Exception {
		Session session = sessionFactory.getCurrentSession();
	      try{
	    	  Transaction transaction = session.beginTransaction();
	          session.save(personalinfo);
	          transaction.commit();
	      } finally {
	    	  if(session.isOpen()){
					session.close();
				}
	      }
	      return "Registration done successfully.";
	}

	@Override
	public String editPersonalInfo(PersonalInformation personalinfo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonalInformation getPersonalInformation(long id) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		PersonalInformation personalInfo = null;
		try{
			Transaction tr = session.beginTransaction();
			Query selectQuery = session.createQuery("from PersonalInformation where id = :id");
	        selectQuery.setLong("id", id);
	        personalInfo = (PersonalInformation)selectQuery.uniqueResult();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return personalInfo;
	}

}
