package Cycles;

import java.util.Scanner;
import java.lang.Math;
//��������� ���������, ��������� �� ����� �������� ����� �� 10 �� 20.

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����");
		int i = scanner.nextInt();
		int n = 2;
		
		while (i <= 10 || i >= 21 ) {
			System.out.println("����� ������� ������ ����� �� 10 �� 20");
			i = scanner.nextInt();
			if (i <= 10)
				break;
		}
		
		System.out.println("���� ����� � ��������");
		System.out.println(Math.pow(i, n));
		scanner.close();
	}
}
