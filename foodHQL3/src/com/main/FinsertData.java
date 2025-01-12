package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.entity.CustDetails;

public class FinsertData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CustDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter name");
		String C_name=sc.nextLine();
		
		System.out.println("enter address");
		String C_address=sc.nextLine();
		
		System.out.println("enter gender");
		String C_gender=sc.next();
		
		System.out.println("enter your no");
		Long C_no=sc.nextLong();
		
		String hqlQuery="insert into CustDetails(name,address,gender,mobileno)values(:myname,:myaddress,:mygender,:mymobileno)";
		NativeQuery<CustDetails> query= ss.createNativeQuery(hqlQuery);
		query.setParameter("myname", C_name);
		query.setParameter("myaddress",C_address);
		query.setParameter("mygender", C_gender);
		query.setParameter("mymobileno", C_no);
		query.executeUpdate();
		System.out.println("Data inserted");
		tr.commit();
		ss.close();
		
		

	}

}
