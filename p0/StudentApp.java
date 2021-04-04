package p0;
import java.util.Scanner;
public class StudentApp {

	Student s;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StudentApp m = new StudentApp();
		
		Student a = new Student("abc", 400, 065, 3000,6 );
		Student b = new Student("xyz", 500, 075, 3000,6 );
		
		m.display(a);
		m.display(b);
		
}	
		public void display(Student s)
		{
			System.out.println("Student Details:\n"+s.getName()+"\nRoll no: "+s.getID()+"\nMarks Obtained: "+s.getMarks()+" out of "+(s.getNumberofsub() *100));
			if(s.getUpdatedfees()==s.getFee())
				System.out.println("\nStudent has passed. "
						+ "No changes in fees viz "+s.getFee());
			else
				System.out.println("Student has failed. Previous fees: "
						+s.getFee()+" Updated Fees: "+s.getUpdatedfees());
			
			
			System.out.println(s.getP()+" "+s.getPercent()+"\n\n");
			
		}
	}

