package Lab6;

import java.util.Scanner;
import java.util.HashMap;

public class Excercise2 {

public static HashMap countChars(char[] a) {
		
		HashMap <Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if (map.containsKey(a[i])){
				int count = map.get(a[i]);
			   
				map.put(a[i], ++count);
			
			} else {
		        map.put(a[i],1);
		    }
		}
		return map;
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter Char here:");
		Scanner sc = new Scanner(System.in);	
		String s = sc.next();
		System.out.println(countChars(s.toCharArray()));
		}

	}

}

