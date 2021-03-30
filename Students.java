package p1;

import java.util.Scanner;

public class Students {
	
	public static void main(String[] args) {
		
		System.out.println("Enter english marks:");
		
		Scanner sc =  new Scanner(System.in);
		 
		int x = sc.nextInt();
		
		System.out.println("Enter java marks:");
		int y = sc.nextInt();
		
		System.out.println("Enter db marks:");
	    int z = sc.nextInt();
	    
	    int TotalMarks = x+y+z;
	    int avg  = TotalMarks/3;
	    
	    System.out.println("TotalMarks = "+TotalMarks);
	    System.out.println("Avg Marks = "+avg);
	}

}
