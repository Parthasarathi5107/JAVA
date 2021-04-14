package com.cg.eis.pl;

import com.cg.eis.service.EmployeeService;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("----Enter Employee details----");
		EmployeeService s = new EmployeeService();
		s.getEmployeeDetails();
		s.getInsuranceScheme();
		s.displayEmployeeDetails();
		
	}
}
