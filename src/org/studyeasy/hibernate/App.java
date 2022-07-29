package org.studyeasy.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Users.class)
									.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			//create new object
			Users user=new Users("habib","1234","habib","habib");
			//start transaction
			session.beginTransaction();
			//perform tansaction
			session.save(user);
			//commit transaction
			session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
