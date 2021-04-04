package p0;
import java.util.Scanner;
public class Basic6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row = sc.nextInt();
		
		int i,j,k=1;
		for (i = 1; i <= row; i++)   
		{  
			for (j = 1; j< i + 1; j++)   
			{ 
				System.out.print(k++ + " ");  
			}
			System.out.println();  
		}
	}

}
