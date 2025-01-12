package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.CustDetails;

public class fetchAll {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CustDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		String hqlQuery="from CustDetails";
		Query<CustDetails> emp=ss.createQuery(hqlQuery,CustDetails.class);
		List<CustDetails> list=emp.getResultList();
		
		for(CustDetails Custdetails : list)
		{
		  	System.out.println(Custdetails);
		}

	}

}
