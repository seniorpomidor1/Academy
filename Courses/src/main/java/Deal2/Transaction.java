package Deal2;

import java.util.Arrays;

import Deal.Product;
import Deal.User;

public class Transaction {

	private String timedate;
	private User seller;
	private User buyer;
	private Product[] basket;
	private String place;
	private Boolean isDone;
	private double fullPrice;
	private int index = 0;

	public Transaction(String place, String timedate, User seller, User buyer, Boolean isDone) {
		this.place = place;
		this.timedate = timedate;
		this.seller = seller;
		this.buyer = buyer;
		this.isDone = isDone;
	}

	public Transaction() {
		super();
	}

	public Transaction(Deal2.User seller2, Deal2.User buyer2) {
		// TODO Auto-generated constructor stub
	}

	public void addProduct(Product product) {
		if (basket == null) {
			index = 0;
			basket = new Product[10];
		}
		if (index >= basket.length) {
			basketgrowth();
		}
		basket[index++] = product;
	}

	private void basketgrowth() {
		Product[] tempbasket = new Product[basket.length * 2 + 1];
		System.arraycopy(basket, 0, tempbasket, 0, basket.length);
		basket = tempbasket;
	}
public void removeProduct (int removeindex) {
if (removeindex < basket.length && removeindex >= 0) {
	System.arraycopy(basket, removeindex, basket, removeindex+1, basket.length);
basket [--index] = null;	
}
}

	public String toString() {
		return "Deal{" + "time=" + timedate + ",buyer=" + buyer + ",saller=" + seller + ",basket="
				+ Arrays.toString(basket) + ",isDone=" + isDone + '}';
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTimedate() {
		return timedate;
	}

	public void setTimedate(String timedate) {
		this.timedate = timedate;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}

	double getFullPrice() {
		return fullPrice;
	}

	public void setFullPrice(double fullPrice) {
		this.fullPrice = fullPrice;
	}

	public void setDone(boolean b) {
		// TODO Auto-generated method stub

	}

}