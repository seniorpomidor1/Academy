package Homework1;

public class Task5 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1);
		Cat cat3 = new Cat(2, "Simka", 3, 0);
		System.out.println(cat2.getGrow());
		System.out.println(cat2.getGrow());
		System.out.println(cat2.getGrow());
		System.out.println(cat3.getSleep());
		System.out.println(cat3.getEat());
		System.out.println(cat3.getNickname());
		System.out.println(cat3.getWalk());
		System.out.println(cat3.getIsHomeAnimal());
		System.out.println(cat3.getInitial());
	}
}
