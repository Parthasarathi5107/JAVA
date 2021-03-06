package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStrings {

	public static void main(String[] args) {
		int n, i;
		ArrayOfStrings two = new ArrayOfStrings();
		System.out.println("How many elements in the array?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements (String):");
		String[] arr = new String[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		two.sortStrings(arr);
		System.out.println("Output:");
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public String[] sortStrings(String arr[]) {
		Arrays.sort(arr);
		String s1, s2;
		int mid;
		for(int i = 0; i < arr.length; i++) {
			mid = (int) Math.ceil(arr[i].length()/2.0);
			s1 = (arr[i].substring(0,mid)).toUpperCase();
			s2 = (arr[i].substring(mid,arr[i].length())).toLowerCase();
			arr[i] = s1 + s2;
		}
		return arr;
	}
	
}
