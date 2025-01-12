package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class DeleteStudMain {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="delete from Student where rollno=:myrollno";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myrollno", 2);
		query.executeUpdate();
		System.out.println("Data deleted successfully");
		tr.commit();
		ss.close();

	}

}
