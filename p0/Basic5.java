package p0;
import java.util.Scanner;
public class Basic5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row = sc.nextInt();
		int i,j,k;
		for (i=1; i<= row ; i++)   
		{  
		for (j = row; j > i ; j--)   
		{  
		System.out.print(" ");  
		}  
		System.out.print("*");  
		for (k = 1; k < 2*(i -1) ;k++)   
		{   
		System.out.print(" ");   
		}  
		if( i==1)   
		{   
		System.out.println("");  
		}  
		else  
		{  
		System.out.println("*");   
		}  
		}   
		for (i=row-1; i>= 1 ; i--)  
		{  
		for ( j = row; j > i ; j--)   
		{  
		System.out.print(" ");  
		}  
		System.out.print("*");  
		for ( k = 1; k < 2*(i -1) ;k++)   
		{  
		System.out.print(" ");  
		}  
		if(i==1)  
		System.out.println("");  
		else  
		System.out.println("*");  
		}  
	}

}
