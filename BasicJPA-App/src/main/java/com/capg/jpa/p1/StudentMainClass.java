package com.capg.jpa.p1;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMainClass {

public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		Student s = new Student();
		s.setAge(20);
		s.setId(101);
		s.setName("a");
		s.setMarks(500);
		
		Certificate c = new Certificate("Technical");
		
		s.setCetificate(c);
		
		Student a =session.get(Student.class, 1);
		a.setName("Partha");
		
		//-----------------------------------------------------------------
		
		Course c1 = new Course("JAVA","CS");
		Course c2 = new Course("Antenna","EC");
		
		List<Course> list = Arrays.asList(c1,c2);
		s.setCourses(list);
		
		session.save(s);
		
		t.commit();
		
		session.close();
		System.out.println("All Done");
		
}

}
