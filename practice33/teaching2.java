package practice33;

import java.util.Scanner;

public class teaching2 {
	public static void main(String[] args) {
//	Create an array of integers that will store 5 elements taken from a user
//
//	Don't print any prompt message for the user
//
//	Then print out all the elements you have created in the first loop in reverse order.

		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int x = 0; x <= 4; x++) {
			System.out.println("input");
			arr[x] = scan.nextInt();
		}

		for (int i = 0; i <= arr.length-1; i++) {
			if (i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
