package Cycles;

import java.util.Scanner;
//—оставьте программы перевода старинных русских мер длины, торгового и аптекарского веса(счетчик цикла от 1 до 10)
//* саженей в метры(1 сажень равна 2,1366 м)
//* из дюймов в сантиметры(1 дюйм равен 2,5 см)
//* футов в метры(1 фут равен 0,3048 м)
//* драхм в граммы(1 драхма равна 3,7325 г)
//* унций в граммы(1 унци€ равна 29,86 г)
//* фунтов в килограммы(1 фунт равен 0,40951 кг)
//* аршинов в метры(1 аршин равен 0,7112 м)
//* золотников в граммы(1 золотник равен 4,2657 г)
//* дюймов в миллиметры(1 дюйм равен 25,3995 мм)

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. »з сажней в метры");
		System.out.println("2. »з дюймов в сантиметры");
		System.out.println("3. »з футов в метры");
		System.out.println("4. »з драхм в метры");
		System.out.println("5. »з унций в граммы");
		System.out.println("6. »з фунтов в килограммы");
		System.out.println("7. »з аршинов в метры");
		System.out.println("8. »з золотников в граммы");
		System.out.println("9. »з дюймов в миллиметры");
		int choise = scanner.nextInt();
		double m = 0;
		switch (choise) {
		case 1:
			System.out.println("¬ведите сажни");
			m = scanner.nextDouble();
			System.out.println(m * 2.1366);
			break;
		case 2:
			System.out.println("¬ведите дюймы");
			m = scanner.nextDouble();
			System.out.println(m * 2.5);
			break;
		case 3:
			System.out.println("¬ведите футы");
			m = scanner.nextDouble();
			System.out.println(m * 0.3048);
			break;
		case 4:
			System.out.println("¬ведите драхмы");
			m = scanner.nextDouble();
			System.out.println(m * 3.7325);
			break;
		case 5:
			System.out.println("¬ведите унции");
			m = scanner.nextDouble();
			System.out.println(m * 29.86);
			break;
		case 6:
			System.out.println("¬ведите фунты");
			m = scanner.nextDouble();
			System.out.println(m * 0.40951);
			break;
		case 7:
			System.out.println("¬ведите аршины");
			m = scanner.nextDouble();
			System.out.println(m * 0.7112);
			break;
		case 8:
			System.out.println("¬ведите золотники");
			m = scanner.nextDouble();
			System.out.println(m * 4.2657);
			break;
		case 9:
			System.out.println("¬ведите дюймы");
			m = scanner.nextDouble();
			System.out.println(m * 25.3995);
			break;
		default:
			System.out.println("“ака€ операци€ невозможна");
		}
		scanner.close();
	}
}
