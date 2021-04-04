package p0;

public class HRsystem {
Employee e;
	
	public static void main(String[] args) {
		HRsystem o=new HRsystem();
		
		Employee e1=new Employee(90,"Mr X","ITC con",12);
		Employee e2=new Employee(110,"Mr A","ITC tex",5);
		Employee e3=new Employee(98,"Mr M","IAZ",1);
		Employee e4=new Employee(67,"Mr Y","YMCA",7);
		
		o.disp(e1);
		o.disp(e2);
		o.disp(e3);
		o.disp(e4);
		
	}
	public void disp(Employee e)
	{
		System.out.println("Employee Name: "+e.getEmpName()+" Employee ID: "+e.getEmpId());
		e.workingOnProject();
		System.out.println("Salary is "+e.getSalary()+" for "+e.getExp()+" years of experience.");
	}
}
