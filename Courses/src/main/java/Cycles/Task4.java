package Cycles;

import java.util.Scanner;
//� ���������� �������� n �����. 
//��������� ���������, ������� ���������� ���-�� �������������,
//���-�� ������������� � ���-�� ����� ����� �������� �����.
//�������� n �������� � ����������.

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����");
		int positive = 0;
		int negative = 0;

		for (int i = 0; i < 3; i++) {
			int a = scanner.nextInt();
			if (a > 0)
				positive++;
			if (a < 0)
				negative++;
		}
		System.out.println("���������� ������������� �����: " + negative);
		System.out.println("���������� ������������� �����: " + positive);
		scanner.close();
	}
}
