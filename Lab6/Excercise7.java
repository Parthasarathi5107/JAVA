package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excercise7 {
	
	public static int[] getSorted(int[] a) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			String s = "" + a[i];
			StringBuilder sbr = new StringBuilder(s);
			String st = "" + sbr.reverse();
			list.add(Integer.parseInt(st));
		}
		
		Collections.sort(list);
		for(int i = 0; i < a.length; i++) {
			a[i] = list.get(i);
		}
		return a;
	}

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Enter the Array size:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("Enter values:");
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		getSorted(a);
		System.out.println("-------------------");
		System.out.println("Sorted Array:");
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	}

}
