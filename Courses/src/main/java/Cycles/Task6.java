package Cycles;

import java.util.*;
//В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите сумму вклада: ");
		double sumOfBody = scanner.nextDouble();
		System.out.print("Введите срок вклада: ");
		int term = scanner.nextInt();
		System.out.print("Введите годовую процентную ставку: ");
		double rate = scanner.nextDouble();
		double sumOfInterest;
		double totalOfInterest = 0;
		for (int i = 1; i <= term; i++) {
			sumOfInterest = sumOfBody * rate / 100;
			totalOfInterest += sumOfInterest;
			sumOfBody += sumOfInterest;
			System.out.println(i + "-й год: " + " начислены проценты в размере " + sumOfInterest
					+ "грн. Проценты капитализированы и сумма вклада составляет " + sumOfBody
					+ "грн. Всего по вкладу накоплено " + totalOfInterest + " грн.");
			scanner.close();
		}
	}
}