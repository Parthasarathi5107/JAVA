package Lab6;
import java.util.*;

public class Excercise5 {


	public static int getSecondSmallest(int[] a) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		
		Collections.sort(list);
		return list.get(1);
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter size of Array :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("Enter values: ");
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Second Smallest Integer is:");
		System.out.println("-------------------------------");
		System.out.println(getSecondSmallest(a));
		}
	}

}