package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Emp;

public class EmpMain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Emp.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		
		String hqlQuery="from Emp";
		Query<Emp> emp=ss.createQuery(hqlQuery,Emp.class);
		List<Emp> list=emp.getResultList();
		
		for(Emp employee : list)
		{
		  	System.out.println(employee);
		}
		
		tr.commit();
	}

}
