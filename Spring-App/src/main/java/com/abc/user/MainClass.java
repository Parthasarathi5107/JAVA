package com.abc.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Student;

public class MainClass {
	
	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext spring=new ClassPathXmlApplicationContext("Spring-Factory.xml");
		
		Student student=(Student)spring.getBean("student");
		System.out.println(student);
		System.out.println(student.getCourse().getName());
	}

}