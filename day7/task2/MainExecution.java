package day7.task2;

public class MainExecution {

public static void main(String[] args) {
		

	EmployeeService service = new EmployeeService();
	String codes[] = service.getEmployeeCodes();
	//String cityCodes[]=service.getEmployeeCodes();
	for (String empid : codes) {
		
		System.out.print("EmpID "+empid.substring(0, 3));
		try {
			service.getEmployeeCity(empid);
		} catch (CityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	}//end main

}//end class

