package Lab9.excercise1;

import java.util.Scanner;

public class Excercise1{
 public static void main(String[] args) {
	
	Demo1 obj = () ->{
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter x and y values:");
     return (long) Math.pow(s.nextInt(), s.nextInt());
	};
	System.out.println("x power y is: "+obj.powerOfX());
}
}
