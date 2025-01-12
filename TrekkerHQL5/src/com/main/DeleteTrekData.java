package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.TrekkerDetails;

public class DeleteTrekData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(TrekkerDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id to delete data");
		int Id=sc.nextInt();
		
		String hqlQuery="delete from TrekkerDetails where T_ID=:myid";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myid", Id);
		query.executeUpdate();
		System.out.println("Data deleted succesfully");
		tr.commit();
		ss.close();
	
	}

}
