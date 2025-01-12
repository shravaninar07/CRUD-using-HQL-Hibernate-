package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import com.entity.Patient;


public class PatientFetchall {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		String hqlQuery="from Patient";
		Query<Patient> query=ss.createQuery(hqlQuery,Patient.class);
		List<Patient> list =query.getResultList();
		for(Patient patient:list) {
			System.out.println(patient);
			
		}
	}

}
