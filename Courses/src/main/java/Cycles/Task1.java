package Cycles;

import java.util.Scanner;
import java.lang.Math;
//Составьте программу, выводящую на экран квадраты чисел от 10 до 20.

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int i = scanner.nextInt();
		int n = 2;
		
		while (i <= 10 || i >= 21 ) {
			System.out.println("Можно вводить только числа от 10 до 20");
			i = scanner.nextInt();
			if (i <= 10)
				break;
		}
		
		System.out.println("Ваше число в квадрате");
		System.out.println(Math.pow(i, n));
		scanner.close();
	}
}
