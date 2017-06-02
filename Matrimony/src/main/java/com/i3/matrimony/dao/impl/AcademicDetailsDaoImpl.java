package com.i3.matrimony.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.i3.matrimony.dao.AcademicDetailsDao;
import com.i3.matrimony.model.AcademicDetails;
import com.i3.matrimony.model.AcademicDetails;

@Component
public class AcademicDetailsDaoImpl implements AcademicDetailsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String createAcademicProfile(AcademicDetails academicData) {
	  Session session = sessionFactory.getCurrentSession();
      try{
    	  Transaction transaction = session.beginTransaction();
          session.save(academicData);
          transaction.commit();
      } finally {
    	  if(session.isOpen()){
				session.close();
			}
      }
      return "Registration done successfully.";
	}

	@Override
	public AcademicDetails getAcademicDetailsById(long userId) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		AcademicDetails academicInfo = new AcademicDetails();
		try{
			Transaction tr = session.beginTransaction();
			Query selectQuery = session.createQuery("from AcademicDetails where userId = :userId");
	        selectQuery.setLong("userId", userId);
	        academicInfo = (AcademicDetails)selectQuery.uniqueResult();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return academicInfo;
	}
}
