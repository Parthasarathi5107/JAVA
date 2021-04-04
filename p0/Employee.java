package p0;

public class Employee {
	private int empId;
	private String empName;
	private String projectName;
	
	private int exp;
	
	private int salary;
	/*
	 *   trigger
	 *   if (exp is less than 3) :- salary should not be greater than 3000
	 *   
	 *   Salary > 20000 :- Error
	 * 
	 * */
	
	
	
	public Employee(int id, String name, String pName, int years)
	{
		empId = id;
		empName=name;
		projectName=pName;
		exp=years;
		calculateSalary();
	}
	
	public void calculateSalary()
	{
		if(exp<3)
			setSalary(3000);
		else if (exp >= 3 && exp <6)
			setSalary(10000);
		else if (exp >= 6 && exp <=10)
			setSalary(15000);
		else if (exp > 10)
			setSalary(20000);
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	/* Business Method / operation */
	public void workingOnProject()
	{
		// 1000 lines of code ...
		System.out.println
		(empName+" working on "
				+ ""+projectName);
		
	}
	
	
	
	

}//end class


