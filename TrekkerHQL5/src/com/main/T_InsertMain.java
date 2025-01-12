package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.TrekkerDetails;

public class T_InsertMain {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(TrekkerDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		 String hqlquery="insert into TrekkerDetails(name,desg,T_amount)values(:myName, :myDesg, :Tamount) ";
		MutationQuery query=ss.createMutationQuery(hqlquery);
		query.setParameter("myName","Khushi Kamble");
		query.setParameter("myDesg", "Harihar fort");
		query.setParameter("Tamount", 1500);
		query.executeUpdate();
		//System.out.println("Data is inserted...");
		
		MutationQuery query1=ss.createMutationQuery(hqlquery);
		query1.setParameter("myName","prisha sabnis");
		query1.setParameter("myDesg", "Harihar fort");
		query1.setParameter("Tamount", 1500);
		query1.executeUpdate();
		System.out.println("Data is inserted...");
		tr.commit();
		ss.close();
		

	}

}
