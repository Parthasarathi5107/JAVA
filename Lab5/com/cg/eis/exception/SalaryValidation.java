package Lab5.com.cg.eis.exception;

public class SalaryValidation {


	public void checkSalary(int salary) throws EmployeeException
	{
		if(salary>=3000)
		{
			System.out.println("Valid Salary");
		}
		else
		{
			throw new EmployeeException("Cannot have Salary below 3000");
		}
	}
}
