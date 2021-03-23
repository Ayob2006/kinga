package practice33;

import java.util.Scanner;

public class repl77 {
//	Create an array of integers that will store 5 elements taken from a user
//
//	Don't print any prompt message for the user
//
//	Then print out all the elements you have created in the first loop in reverse order.
//
	public static void main(String[] args) {
		
		int [] num = new int[5];
		
		Scanner scan = new Scanner(System.in);
		for( int x= 0; x<=num.length-1; x++) {
		
		System.out.println("input: ");
		num [x] =  scan.nextInt();
		}
	}
}
