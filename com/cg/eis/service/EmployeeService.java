package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeService  implements Service{

	Employee e = new Employee();
	Scanner sc = new Scanner(System.in);

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID: ");
		e.setId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Employee Name: ");
		e.setName(sc.nextLine());
		
		System.out.println("Enter Salary: ");
		e.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Enter Employee Designation: ");
		e.setDesignation(sc.nextLine());
		
	}

	@Override
	public void getInsuranceScheme() {
		// TODO Auto-generated method stub
		if(e.getDesignation().equals("Manager") || e.getDesignation().equals("HR") ) {
			e.setInsuranceScheme("Yearly");
		}
		else if(e.getDesignation().equals("Project Leader") || e.getDesignation().equals("Mentor")) {
			e.setInsuranceScheme("Monthly");
			
		}
		else
		{
			e.setInsuranceScheme("default Scheme");
		}
		
		
	}

	@Override
	public void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee ID: "+e.getId());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Employee Designation: "+e.getDesignation());
		System.out.println("Insurance Scheme: "+e.getInsuranceScheme());
	}
	
	
}
