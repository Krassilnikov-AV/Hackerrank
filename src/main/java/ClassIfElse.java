/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

import java.util.*;

/**
 * Задача
 * Учитывая целое число,выполните следующие условные действия:
 * <p>
 * Если n нечетное, напечатайте Weird (+)
 * Если n является четным и находится в инклюзивном диапазоне 2 к 5, Распечатать Not Weird (+)
 * Если n является четным и находится в инклюзивном диапазоне 6 к 20, Распечатать Weird (+)
 * Если n даже и больше, чем 20, Распечатать Not Weird (-)
 * Заполните код-заглушку, предоставленный в вашем редакторе, чтобы печатать,
 * независимо от того,  странно. (-)
 * <p>
 * Формат ввода
 * <p>
 * Единственная строка, содержащая положительное целое число, n.
 * <p>
 * Ограничения
 * 1 =< n =< 100
 * Выходной формат
 * <p>
 * Печать, Weird если число странно; в противном случае напечатайте Not Weird.
 */

public class ClassIfElse {
	private static final Scanner scanner = new Scanner(System.in);
ArrayList list;
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // пропустть
		if (n % 2 == 0 && n >= 1 && n <= 100) {

			System.out.println("Not Weird");

			if (n > 2 && n < 5 && n > 6 && n < 20) {
				System.out.println("Weird");
			}
		} else {
			System.out.println("Weird");
		}

		scanner.close();
	}
}