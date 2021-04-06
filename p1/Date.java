package p1;

import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		System.out.println("Enter Date: ");
		
		Scanner sc =  new Scanner(System.in);
		
		int Date = sc.nextInt();
		 if (Date >= 4 && Date <= 20) 
		 {
		        System.out.println(Date+"th");
		    }
		 else if (Date == 1 || Date == 21 || Date == 31)
		 {
			 System.out.println(Date+"st");
		 }
		 else if (Date == 2 || Date == 22)
		 {
			 System.out.println(Date+"nd");
		 }
		 else if(Date >= 31)
		 {
			 System.out.println("Wrong Date");
		 }
	}
}
