/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package scaner;

import java.security.Permission;
import java.util.Scanner;

class Run {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			String s;
			for (int n = 0; n >= -100 || n >= 100; n++) {
				s = scan.nextLine();
				n = Integer.parseInt(s);

				if (n == Integer.parseInt(s)) {
					System.out.println("Good job");
				} else {
					System.out.println("Wrong answer.");
				}
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
