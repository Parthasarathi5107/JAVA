package p0;
import java.util.Scanner;
public class Basic1 {

	public static void main(String[] args) {
		
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row = sc.nextInt();
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
	}
}
