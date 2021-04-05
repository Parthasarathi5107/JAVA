package Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		int n, i;
		DuplicateArray four = new DuplicateArray();
		System.out.println("How many elements in the array?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Output:");
		four.modifyArray(arr);
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] modifyArray(int arr[]) {
		Arrays.sort(arr);
		int i, j = 0, n = arr.length;
		for(i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		while(j < n) {
			arr[j++] = 0; 
		}
		
		for (i = 0; i < n-1; i++) {
            for (j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    	}
		return arr;
	}
	
}
