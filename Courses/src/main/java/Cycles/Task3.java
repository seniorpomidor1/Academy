package Cycles;

import java.util.Scanner;
//��������� ���������, ������� ��������� ������������ ����� �� 1 �� n. �������� n
//�������� � ����������

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ �����");
		int i = scanner.nextInt();
		System.out.println("������� ������ �����");
		int n = scanner.nextInt();
		int rez = i * n;
		System.out.println(rez);
		scanner.close();
	}
}
