package Cycles;

import java.util.Scanner;
//��������� ��������� �������� ��������� ������� ��� �����, ��������� � ������������ ����(������� ����� �� 1 �� 10)
//* ������� � �����(1 ������ ����� 2,1366 �)
//* �� ������ � ����������(1 ���� ����� 2,5 ��)
//* ����� � �����(1 ��� ����� 0,3048 �)
//* ����� � ������(1 ������ ����� 3,7325 �)
//* ����� � ������(1 ����� ����� 29,86 �)
//* ������ � ����������(1 ���� ����� 0,40951 ��)
//* ������� � �����(1 ����� ����� 0,7112 �)
//* ���������� � ������(1 �������� ����� 4,2657 �)
//* ������ � ����������(1 ���� ����� 25,3995 ��)

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. �� ������ � �����");
		System.out.println("2. �� ������ � ����������");
		System.out.println("3. �� ����� � �����");
		System.out.println("4. �� ����� � �����");
		System.out.println("5. �� ����� � ������");
		System.out.println("6. �� ������ � ����������");
		System.out.println("7. �� ������� � �����");
		System.out.println("8. �� ���������� � ������");
		System.out.println("9. �� ������ � ����������");
		int choise = scanner.nextInt();
		double m = 0;
		switch (choise) {
		case 1:
			System.out.println("������� �����");
			m = scanner.nextDouble();
			System.out.println(m * 2.1366);
			break;
		case 2:
			System.out.println("������� �����");
			m = scanner.nextDouble();
			System.out.println(m * 2.5);
			break;
		case 3:
			System.out.println("������� ����");
			m = scanner.nextDouble();
			System.out.println(m * 0.3048);
			break;
		case 4:
			System.out.println("������� ������");
			m = scanner.nextDouble();
			System.out.println(m * 3.7325);
			break;
		case 5:
			System.out.println("������� �����");
			m = scanner.nextDouble();
			System.out.println(m * 29.86);
			break;
		case 6:
			System.out.println("������� �����");
			m = scanner.nextDouble();
			System.out.println(m * 0.40951);
			break;
		case 7:
			System.out.println("������� ������");
			m = scanner.nextDouble();
			System.out.println(m * 0.7112);
			break;
		case 8:
			System.out.println("������� ���������");
			m = scanner.nextDouble();
			System.out.println(m * 4.2657);
			break;
		case 9:
			System.out.println("������� �����");
			m = scanner.nextDouble();
			System.out.println(m * 25.3995);
			break;
		default:
			System.out.println("����� �������� ����������");
		}
		scanner.close();
	}
}
