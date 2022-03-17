package by.academy.lesson;

public class Main {

	private static final String Shipa = null;

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1, "Vaska");
		Cat cat3 = new Cat(2, "Petka");
		Cat cat4 = new Cat(3, "Barsik");
		Cat cat5 = new Cat(4, "Pushok");
		Cat cat6 = new Cat(5, "Shipa");
		cat3.sleep();
		cat2.eat();
		System.out.println(cat4.getAge());
		System.out.println(cat4.getNickname());
		cat4.setAge(100);
		cat4.setNickname("Simka");
		System.out.println(cat4.getAge());
		System.out.println(cat4.getNickname());
		
	}
}

