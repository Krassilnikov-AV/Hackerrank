/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package scaner;

import java.util.Scanner;

public class Sol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;

		for (int n = 0; n >= -100 || n >= 100; n++) {
			s = scan.next();
			n = Integer.parseInt(s);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		}
	}
//	catch (DoNotTerminate.ExitTrappedException e) {
//		System.out.println("Unsuccessful Termination!!");
//	}
}