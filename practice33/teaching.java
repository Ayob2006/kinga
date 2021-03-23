package practice33;

import java.util.Scanner;

public class teaching {
	
	
	public static void main(String[] args) {
		
//		Write a program that creates a String array with size 7.
//
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//
//		Add these inputs to your array and then print all values from that array
//		
		
		String [] days = new String[7];
		Scanner scan = new Scanner(System.in);
		for ( int x=0;x<=6;x++) {
		System.out.println(" please enter the day " + (x+1)+" of the week");
		
		days [x] = scan.nextLine();
		}
		
		
		for(int  i=days.length-1; i>=0; i--) {
			System.out.print(days[i]+" ");
		}
		
		
	}

}
