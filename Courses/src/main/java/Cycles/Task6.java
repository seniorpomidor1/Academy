package Cycles;

import java.util.*;
//� ��������� �� ������������� ����� �������� S ������.����� ������ ����� ������ ����� N ���.

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ����� ������: ");
		double sumOfBody = scanner.nextDouble();
		System.out.print("������� ���� ������: ");
		int term = scanner.nextInt();
		System.out.print("������� ������� ���������� ������: ");
		double rate = scanner.nextDouble();
		double sumOfInterest;
		double totalOfInterest = 0;
		for (int i = 1; i <= term; i++) {
			sumOfInterest = sumOfBody * rate / 100;
			totalOfInterest += sumOfInterest;
			sumOfBody += sumOfInterest;
			System.out.println(i + "-� ���: " + " ��������� �������� � ������� " + sumOfInterest
					+ "���. �������� ���������������� � ����� ������ ���������� " + sumOfBody
					+ "���. ����� �� ������ ��������� " + totalOfInterest + " ���.");
			scanner.close();
		}
	}
}