package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.entity.CustDetails;

public class FDeleteData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CustDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your id to delete");
	    int C_id = sc.nextInt();
	    
		
		String hqlQuery="delete from CustDetails  where custId=:myid";
		NativeQuery<CustDetails> query= ss.createNativeQuery(hqlQuery);
		query.setParameter("myid", C_id);
		query.executeUpdate();
		System.out.println("Data deleted");
		tr.commit();

	}

}
