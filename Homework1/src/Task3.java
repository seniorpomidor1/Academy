import java.util.Scanner;
public class Task3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������� �����");
			int x = scanner.nextInt();
			int y = 1;
			int z;
			while (y < 11) {
				z = x * y;
				System.out.println(x + " * " + y + " = " + z);
				y++;
			}
		}
	}