/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package sistemPrintf;

import java.util.*;

/*

Функцию Java System.out.printf можно использовать для печати форматированного вывода.
 Цель этого упражнения - проверить ваше понимание форматирования вывода с помощью printf .

Для начала вам предлагается часть решения в редакторе;
вы должны отформатировать и распечатать ввод, чтобы завершить решение.

Формат ввода

Каждая строка ввода будет содержать строку, за которой следует целое число.
Каждая строка будет иметь максимум 10 буквенные символы,
и каждое целое число будет находиться в инклюзивном диапазоне от 0 к 999.

Формат вывода

В каждой строке вывода должно быть два столбца:2
первый столбец содержит строку и выровнен по левому краю с использованием точно 15 персонажи.
Второй столбец содержит целое число , выраженное точно вцифры; если исходный ввод содержит менее трех цифр,
необходимо дополнить начальные цифры вывода нулями.
Пример ввода

java 100
cpp 65
python 50
Пример вывода

================================
java           100
cpp            065
python         050
================================
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = null;
		int x = 0;
		System.out.println("================================");
		List str = new ArrayList();
		List num = new ArrayList();
		for (int i = 0; i < 3; i++) {
			s1 = sc.next();
			x = sc.nextInt();
			//Complete this line
			str.add(s1);
			num.add(x);
		}
		sc.close();
		System.out.println("================================");

		for (s:str) {
			s.
		}
		System.out.printf("%s   %d \n", s, x);
	}
}