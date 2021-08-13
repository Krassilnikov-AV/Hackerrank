package scaner;/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();  // "Welcome to HackerRank's Java tutorials!";
		// Write your code here.
		double d = scan.nextDouble(); //3.1415;

		int i = scan.nextInt();




		scan.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}