package p1;

import java.util.Iterator;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		
		System.out.println("Enter Basic Salary: ");
		
			
		
		Scanner sc =  new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
		int basicsalary = sc.nextInt();
		double HRA = 0.40 * basicsalary;
		double DA = 0.60 * (basicsalary + HRA);
		double Tax = 0;
		double annualsalary = (basicsalary + HRA + DA) * 12 ;
		if(annualsalary < 2000000)
		{
			Tax = 0;
		}
		else if(annualsalary >= 2000000 ||annualsalary <= 6000000 )
		{
			Tax = 0.10 * annualsalary;			
		}
		else if(annualsalary > 6000000)
		{
			 Tax = 0.20 * annualsalary;		
		}		
		System.out.println("HRA :"+HRA);
		System.out.println("DA :"+DA);
		System.out.println("Tax :"+Tax);
		System.out.println("Annualsalary :"+annualsalary);
		}	
	}
}
