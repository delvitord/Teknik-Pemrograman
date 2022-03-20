package depedence;

public class Cashier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount discount = new Discount(100000, 50);
		
		System.out.println("Diskon 50% dari Rp100.000 adalah: Rp" + discount.getDiscount());
	
	}

}
