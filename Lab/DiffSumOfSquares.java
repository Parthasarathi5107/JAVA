package Lab;

public class DiffSumOfSquares {

	static int SquareDiff(int n){

		int a, b, c;

			a = (n * (n + 1) * (2 * n + 1)) / 6;
			b= (n * (n + 1)) / 2;
			b=b * b;
			c= Math.abs(a - b);
			return c;

		}


		public static void main(String s[])
		{
			int n = 5;
			System.out.println(SquareDiff(n));	
			
		}
}
