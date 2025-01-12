package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Emp;

public class UpdateEmpMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="update Emp set name=:myname, dept=:mydept, salary=:mysalary where empID=:myid";
		Query query=ss.createQuery(hqlQuery);
		query.setParameter("myname", "Vaish");
		query.setParameter("mydept", "frontend developer");
		query.setParameter("mysalary", 90000);
		query.setParameter("myid", 3);
		query.executeUpdate();
		System.out.println("Data updated succesfully");
		tr.commit();
		ss.close();

	}

}
