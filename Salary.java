package p1;

import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		
		System.out.println("Enter Basic Salary: ");
		
		Scanner sc =  new Scanner(System.in);
		
		int basicsalary = sc.nextInt();
		double HRA = 0.40 * basicsalary;
		double DA = 0.60 * (basicsalary + HRA);
		double Tax = 0;
		
		if(basicsalary < 2000000)
		{
			Tax = 0;
		}
		else if(basicsalary >= 2000000 || basicsalary <= 6000000 )
		{
			Tax = 0.10 * basicsalary;			
		}
		else if(basicsalary > 6000000)
		{
			 Tax = 0.20 * basicsalary;		
		}
		double annualsalary = basicsalary + HRA + DA - Tax;
		System.out.println("HRA :"+HRA);
		System.out.println("DA :"+DA);
		System.out.println("Tax :"+Tax);
		System.out.println("Annualsalary :"+annualsalary);
		
		
	}
}
