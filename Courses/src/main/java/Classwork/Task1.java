package Classwork;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� �����: ");
		int n = in.nextInt();
		while (n <= 3) {
			System.out.print("��������� ����: ");
			n = in.nextInt();
		}
		int[] array = new int[10];
		Random rand = new Random();
		for (int i= 0; i < array.length; i++) {
				array[n] = rand.nextInt(10);
		}
		int[] array1 = new int[10];
		 for (int i = 0; i <= n; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	                }
		 }
		in.close();
	}
}
// ������ ����� �� 3, ���� ����� ������ 3 ��������� ����, ������� ������ �� 0 �� � � ������� ���, ������� ������� � ������� ������ ������ ����� 

