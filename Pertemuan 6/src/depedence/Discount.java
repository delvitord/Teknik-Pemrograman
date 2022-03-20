package depedence;

public class Discount {
	private int price;
	private int percent;
	
	Discount (int price, int percent) {
		this.price = price;
		this.percent = percent;
	}
	
	public int getDiscount() {
		int totalDiscount = price * percent / 100;
		return totalDiscount;
	}
}
