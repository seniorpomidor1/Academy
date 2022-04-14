package Deal2;

public class Shop {

public static void main(String[] args) {
	 User seller = new User("Mike", 21, 1800);
	 User buyer = new User("Andy", 18, 3200);
	 Vine vine = new Vine("Alamorte", "S", 7, 500, "Red", 10);
	 Vine vine2 = new Vine("Gusar", "XL", 15, 1500, "Red", 14);
	 Vine vine3 = new Vine("Whitevolf", "M", 4, 7500, "White", 7);
	
	 Transaction transaction = new Transaction(seller, buyer);
	 System.out.println(transaction);
	 transaction.addProduct(vine);
	 transaction.addProduct(vine2);
	 transaction.addProduct(vine3);
	 System.out.println(transaction);
}
}
	 
