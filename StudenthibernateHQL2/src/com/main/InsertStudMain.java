package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class InsertStudMain {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="insert into Student(name,M_no)values(:myname,:myno)";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", "Priya");
		query.setParameter("myno", 9898989898l);
		query.executeUpdate();
		tr.commit();
		ss.close();
		

	}

}
