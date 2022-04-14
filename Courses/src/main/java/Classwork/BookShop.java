package Classwork;

public class BookShop {

	public static void main(String[] args) {
		Printable[] array = new Printable[4];
		array[0] = new Book();
		array[1] = new Magazine();
		array[2] = new Book();
		array[3] = new Book();
		for (int i = 0; i < array.length; i++) {
			
			
			array[i].print();
		}
	Magazine.printMagazines(array);
	Book.printBook(array);
	}
}