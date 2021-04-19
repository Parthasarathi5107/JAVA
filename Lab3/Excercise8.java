package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise8{

    static boolean isAlphabaticOrder(String s)
    {
        
        int n = s.length();

        
        char c[] = new char [n];

      
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }

        Arrays.sort(c);

        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;

        return true;
    }

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter String: ");
        String s = sc.nextLine();

        if (isAlphabaticOrder(s))
           System.out.println("True");
        else
            System.out.println("False");

    }
}