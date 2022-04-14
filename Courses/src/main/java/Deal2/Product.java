package Deal2;

public abstract class Product {

	private String name;
	private String type;
	private int quantity;
	private double price;
	
	 public Product(String name, String type, int quantity, double price) {
		 this.name = name;
		 this.type = type;
		 this.quantity = quantity;
		 this.price = price;
	 }
	 public Product() {
	 }
	 public double getCalculaterPrice() { 
		 return price * quantity * getDiscount();
	 }
	 public abstract double getDiscount();
	 
	 public String toString() {
		 return "Product{" +
	 "quantity=" + quantity +
	 ", type='" + type + '\''+
	 ", name='" + name + '\''+
	 ", price=" + price +
	 '}';
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
