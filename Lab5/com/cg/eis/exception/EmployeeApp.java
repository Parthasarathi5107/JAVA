package Lab5.com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		SalaryValidation validate = new SalaryValidation();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Salary: ");
		
		int salary=Integer.parseInt(sc.nextLine());
		try {
			validate.checkSalary(salary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
	
}
