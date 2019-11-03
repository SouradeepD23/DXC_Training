package com.mysprhib.resturantdao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysprhib.model.Resturant;

@Component
public class ResturantDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void saveResturant(Resturant resturant){	
	Session session=	sessionFactory.getCurrentSession();
	session.save(resturant);
	}

	public ResturantDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	
	public ResturantDao() {
		}
	
	
}
