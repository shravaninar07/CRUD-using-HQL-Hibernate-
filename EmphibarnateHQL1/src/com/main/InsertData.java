package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Emp;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="insert into Emp(name,dept,salary)values(:myname, :mydept, :mysalary)";
		Query query=ss.createQuery(hqlQuery);
		query.setParameter("myname", "Sujata");
		query.setParameter("mydept", "backend developer");
		query.setParameter("mysalary", 70000);
		query.executeUpdate();
		System.out.println("Data inserted succesfully");
		tr.commit();
		ss.close();

	


	}

}
