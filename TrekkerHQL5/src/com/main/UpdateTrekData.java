package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.TrekkerDetails;

public class UpdateTrekData {
	
	public static void main(String[] args) {

		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(TrekkerDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		 Scanner sc = new Scanner(System.in) ;
		 
		    System.out.println("Enter Id to update:");
		    int Id=sc.nextInt();
		    sc.nextLine();
		 
			System.out.println("Enter your name");
			String Name=sc.nextLine();
			
			System.out.println("Enter your Trekking destination");
			String Desg=sc.nextLine();
			
			System.out.println("Enter paid amount");
			int Amt=sc.nextInt();
		
		
		String hqlQuery="update TrekkerDetails set name=:myname, desg=:myDesg, T_amount=:myamt where T_ID=:myid";
		MutationQuery query =ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", Name);
		query.setParameter("myDesg", Desg);
		query.setParameter("myamt", Amt);
		query.setParameter("myid",Id);
		query.executeUpdate();
		System.out.println("Data is updated");
		tr.commit();
		ss.close();
		
		
		
		
		
		
		

	}}


