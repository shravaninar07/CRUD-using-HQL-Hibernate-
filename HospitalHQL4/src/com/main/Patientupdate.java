package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;


import com.entity.Patient;

public class Patientupdate {

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
		sc.nextLine();
		
		System.out.println("Enter your name");
		String Name=sc.nextLine();
		
		
		System.out.println("Enter your dignose");
		String dignose=sc.nextLine();
		
		
		System.out.println("Enter your age");
		int Age =sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter your mobile no");
		long mno=sc.nextLong();
		sc.nextLine();
		
		String hqlQuery="update Patient set name=:myname, Dignose=:mydignose, age=:myage ,gender=:mygender, mobileNo=:mymobileno where Id=:myId";
		MutationQuery query =ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", Name);
		query.setParameter("mydignose",dignose);
		query.setParameter("myage",Age);
		query.setParameter("mygender", gender);
		query.setParameter("mymobileno",mno );
		query.setParameter("myId",Id );
		query.executeUpdate();
		System.out.println("Data updated");
		tr.commit();
		ss.close();
	

	}

}
