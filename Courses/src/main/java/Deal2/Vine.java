package Deal2;

import Deal2.Product;

public class Vine extends Product {
	 
	private int age;
	private String color;
	 
	
	public Vine() {
		super();
	}
	
		public Vine(String name, String type, int quantity, double price, String color, int age) {
			 super(name, type, quantity, price);
			 this.color = color; 
			 this.age = age;
	}
        public double getDiscount() {
        	if(age > 5) {
        		return 0.9;
        	}
        	return 0.85;
        	}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Vine [age=" + age + ", color=" + color + "]";
		} 
		
}
