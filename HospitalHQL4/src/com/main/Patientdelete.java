package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.entity.Patient;

public class Patientdelete {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id");
		int Id=sc.nextInt();
		
		String hqlQuery="delete from Patient where Id=:myId";
		NativeQuery<Patient>query =ss.createNativeQuery(hqlQuery);
		query.setParameter("myId", Id);
		query.executeUpdate();
		System.out.println("Data deleted");
		tr.commit();
		ss.close();
	}

}
