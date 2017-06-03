package com.i3.matrimony.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.i3.matrimony.dao.PhysicaDetailsDao;
import com.i3.matrimony.model.PhysicalDetails;

@Component
public class PhysicalDetailsDaoImpl implements PhysicaDetailsDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String createPhysicalDetails(PhysicalDetails physicalData) {
	  Session session = sessionFactory.getCurrentSession();
      try{
    	  Transaction transaction = session.beginTransaction();
          session.save(physicalData);
          transaction.commit();
      } finally {
    	  if(session.isOpen()){
				session.close();
			}
      }
      return "Registration done successfully.";
	}

	@Override
	public PhysicalDetails getPhysicalDetailsById(String userId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		PhysicalDetails physicalInfo = new PhysicalDetails();
		try{
			Transaction tr = session.beginTransaction();
			Query selectQuery = session.createQuery("from PhysicalDetails where userId = :userId");
	        selectQuery.setString("userId", userId);
	        physicalInfo = (PhysicalDetails)selectQuery.uniqueResult();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return physicalInfo;
	}

}
