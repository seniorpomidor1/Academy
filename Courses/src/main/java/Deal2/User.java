package Deal2;

public class User {

	private String name;
	private int age;
	private double money;
	
	public User() {
		super();
	}
	public User(String name, int age, double money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	public void getCheckMoney(double totalPrice) {
		if(totalPrice > money) {
			System.out.println("Денег нет");
			return;
		}else {
			System.out.println("Денег хватит");
		}
	}
	public double sallerSold(double fullPrice) {
		this.money += fullPrice;
		return money;
	}
	public double buyerPay(double fullPrice) {
		this.money -= fullPrice;
		return money;
	}
	public String toString() {
		return "User{" +
	"name='" + name + '\''+
	", age=" + age +
	", money=" + money +
	'}';
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public void sellerSold(double fullPrice) {
		// TODO Auto-generated method stub
		
	}
	
}
