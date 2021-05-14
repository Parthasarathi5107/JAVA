package Lab9.excercise2;

import java.util.*;

public class Excercise2 {
   public static void main(String[] args) {
	   
	Demo2 obj = ()->{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		return sc.next().replace(""," ").trim();
	};
	System.out.println("Output string: "+ obj.addSpace());
}
}
