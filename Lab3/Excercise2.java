package Lab3;

import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		String a=getImage(s);
		System.out.println(s+"|"+a);
	}
	
	public static String getImage(String s)
	{
		return new StringBuffer(s).reverse().toString();
	}
}
