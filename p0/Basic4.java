package p0;
import java.util.Scanner;
public class Basic4 {
	
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row = sc.nextInt();
		
		int i,j,k;
		
		for (i=1; i<= row ; i++)  
		{  
		for (j = i; j < row ; j++)   
		{  
		System.out.print(" ");  
		}     
		for (k = 1; k <= (2*i -1) ;k++)   
		{  
		if(k==1 || i == row || k==(2*i-1))   
		{  
		System.out.print("*");  
		}  
		else   
		{  
		System.out.print(" ");  
		}  
		}  
		System.out.println("");  
		}  
		  
	}

}
