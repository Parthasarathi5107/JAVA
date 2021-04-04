package p0;
import java.util.Scanner;
public class Basic3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row = sc.nextInt();
		
		int i,j,space;
		space = row - 1;
		
		for (j = 1; j<= row; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= row - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (row - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
	}  
}  
	

