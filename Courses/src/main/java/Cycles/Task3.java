package Cycles;

import java.util.Scanner;
//Составьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
//вводится с клавиатуры

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число");
		int i = scanner.nextInt();
		System.out.println("Введите второе число");
		int n = scanner.nextInt();
		int rez = i * n;
		System.out.println(rez);
		scanner.close();
	}
}
