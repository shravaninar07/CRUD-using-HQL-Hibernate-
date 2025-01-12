package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Emp;

public class deleteEmpMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="delete from Emp where empID=:myid";
		Query query=ss.createQuery(hqlQuery);
		query.setParameter("myid", 3);
		query.executeUpdate();
		System.out.println("Data deleted succesfully");
		tr.commit();
		ss.close();
	}

}
