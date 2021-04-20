package com.capg.emsapp.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.service.EmployeeServiceImpl;
import com.capg.emsapp.service.IEmployeeService;

public class MainUIClass {
	Scanner sc;
	IEmployeeService empService;
	
	public MainUIClass() {
		empService = new EmployeeServiceImpl();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		MainUIClass obj = new MainUIClass();
		int n;
		do
		{
		Scanner s = new Scanner(System.in);
		System.out.println("---Enter your choice---");
		System.out.println("1:- Display all Employee");
		System.out.println("2:- Insert Employee Information");
		System.out.println("3:- Display Employee");
		System.out.println("4:- Display Employee by Salary");
		System.out.println("5:- Display Employee by ID");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			obj.displayAllEmployee();
			break;
			
		case 2:
			obj.insertEmployeeInforamtion();
			break;
			
		case 3:
			obj.displayAllEmployee();
			break;
			
		case 4:
			System.out.println("Enter range1: ");
			int range1=s.nextInt();
			System.out.println("Enter range2:");
			int range2=s.nextInt();
			System.out.println(" ");
			obj.getAllEmployeesBySalary(range1, range2 );
			break;
			
		case 5:
			System.out.println("Enter ID : ");
			int id=s.nextInt();
			obj.getEmployeeByID(id);
			
			
		}
		System.out.println("Enter 6 to continue: ");
		n=s.nextInt();
		}while(n==6);
		
	}
	
	public void insertEmployeeInforamtion()
	{
		System.out.println(" \n Enter Employee Informations \n");
		System.out.println(" Enter Employee Name : ");
		String empName = sc.nextLine();
		
		System.out.println(" Enter Employee Id : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Employee Salary : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Project  Name : ");
		String projectName = sc.nextLine();
		
		Employee e = new Employee(empName, id, salary, projectName);
		
		try
		{
			boolean isInserted = empService.insertEmployee(e);
			
			// -----
		}
		catch(Exception excep)
		{
			
			System.out.println(" Contact HR "+excep);
		}
		
		
	}
	
	public void displayAllEmployee()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployees();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(" Name "+e.getEmpName());
		System.out.println(" ID "+e.getId());
		System.out.println(" Salary "+e.getSalary());
		System.out.println("Project Name "+e.getProjectName());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	
	public void getAllEmployeesBySalary(int range1,int range2)
	{ 
		List<Employee> empSalaryList=empService.getAllEmployeesBySalary(range1, range2);
		for (Employee employee : empSalaryList) {
			displayEmployee(employee);
		}
	}
	
	public void getEmployeeByID(int id)
	{
        System.out.println(" ");
		displayEmployee(empService.getEmployeeById(id));
	}

}