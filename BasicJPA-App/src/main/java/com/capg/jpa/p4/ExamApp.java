package com.capg.jpa.p4;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ExamApp {

	public static void main(String[] args) {
		
		Examination e =  new Examination("English", 100, LocalDate.now());
		
		InternalExam i = new InternalExam("Java", 100, LocalDate.now(), 80, 4);
		
		ExternalExam ex = new ExternalExam("VLSI", 100,LocalDate.now(), 3, 85);
		
		Configuration cfg = new Configuration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();

		Transaction t = session.beginTransaction();
		
		session.save(e);
		session.save(i);
		session.save(ex);
		

		t.commit();

		System.out.println(" Data Saved");
	}
}
