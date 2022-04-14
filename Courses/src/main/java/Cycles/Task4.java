package Cycles;

import java.util.Scanner;
//С клавиатуры вводятся n чисел. 
//Составьте программу, которая определяет кол-во отрицательных,
//кол-во положительных и кол-во нулей среди введеных чисел.
//Значение n вводится с клавиатуры.

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int positive = 0;
		int negative = 0;

		for (int i = 0; i < 3; i++) {
			int a = scanner.nextInt();
			if (a > 0)
				positive++;
			if (a < 0)
				negative++;
		}
		System.out.println("количество отрицательных чисел: " + negative);
		System.out.println("количество положительных чисел: " + positive);
		scanner.close();
	}
}
