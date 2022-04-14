package Classwork;

public class Magazine implements Printable {

	@Override
	public void print() {
		System.out.println("Печатает журнал");

	}

	public static void printMagazines(Printable[] printable) {
		for (Printable help : printable) {
			if (help instanceof Magazine) {
				help.print();
			}
		}
	}
}
