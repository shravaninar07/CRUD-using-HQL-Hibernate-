package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class UpdateStudMain {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="update Student set name=:myname, M_no=:myNo where rollno=:myrollno";
	    MutationQuery query=ss.createMutationQuery(hqlQuery);
	    query.setParameter("myname", "Shravani");
	    query.setParameter("myNo", 9881070667l);
	    query.setParameter("myrollno", 2);
	    query.executeUpdate();
	    tr.commit();
	    ss.close();
	    
	}

}
