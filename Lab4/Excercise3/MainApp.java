package Lab4.Excercise3;

import java.util.Scanner;

public class MainApp {

public static void main(String[] args) {
		
		Book book = new Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id: ");
		int bid = sc.nextInt();
		System.out.println("Enter Book Author: ");
		String ba = sc.next();
		System.out.println("Enter no. of copies: ");
		int nc = sc.nextInt();
		System.out.println("Enter Book title: ");
		String bt = sc.next();
		System.out.println("Enter published year: ");
		int py = sc.nextInt();
		
		book.setIdNum(bid);
		book.setAuthor(ba);
		book.setNumOfCopies(nc);
		
		book.setTitle(bt);
		book.setPubYear(py);
		
		book.print();
		
	}
}

