package com.i3.matrimony.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.i3.matrimony.dao.ProfessionalDetailsDao;
import com.i3.matrimony.model.ProfessionalDetails;

@Component
public class ProfessionalDetailsDaoImpl implements ProfessionalDetailsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String createProfessionaalProfile(ProfessionalDetails professionalData) {
	  Session session = sessionFactory.getCurrentSession();
      try{
    	  Transaction transaction = session.beginTransaction();
          session.save(professionalData);
          transaction.commit();
      } finally {
    	  if(session.isOpen()){
				session.close();
			}
      }
      return "Registration done successfully.";
	}

	@Override
	public ProfessionalDetails getProfessionalDetailsById(String userId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		ProfessionalDetails professionalInfo = new ProfessionalDetails();
		try{
			Transaction tr = session.beginTransaction();
			Query selectQuery = session.createQuery("from ProfessionalDetails where userId = :userId");
	        selectQuery.setString("userId", userId);
	        professionalInfo = (ProfessionalDetails)selectQuery.uniqueResult();
		} finally {
			if(session.isOpen()){
				session.close();
			}
		}
		return professionalInfo;
	}

}
