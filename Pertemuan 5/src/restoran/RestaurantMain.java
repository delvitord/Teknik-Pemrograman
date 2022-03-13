package restoran;
import java.util.Scanner;

public class RestaurantMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//Agar user bisa memesan
		
		
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
	
		
		menu.tampilMenuMakanan();
		
		/*Bagian pemesanan menu oleh user */
		System.out.println("Mau pesan menu? (Y/N)");
		char isOrder = scan.next().charAt(0);
		if (isOrder == 'Y') {
			System.out.println("Berapa menu?");
			int totalMenu = scan.nextInt();		//total menu yang dipesan
			int idFood;
			int totalFood;
			boolean valid;		//agar inputan dinyatakan valid dari segi kesediaan stok barang
			for (int i = 1; i <= totalMenu; i++) {		//perulangan sebanya total menu yang dipesan
				valid = false;
				do {			//ketika menu yang dipesan ternyata stoknya habis, program akan looping sampai user memilih menu yang ada stoknya
					System.out.println("<id>. <Nama Makanan> \n1. Bala-Bala\n2. Gehu\n3. Tahu\n4. Molen\nMasukkan id:");
					idFood = scan.nextInt();
					if (!menu.isOutOfStock(idFood-1)) {
						valid = true;
					} else {
						System.out.println("Stok habis!");
					}
				} while (valid == false);
				
				valid = false;
				do {		//ketika total makanan yang dipesan ternyata lebih dari stok yang tersedia,
							//program akan looping sampai user menginput tidak lebih dari stok barang
					System.out.println("Berapa totalnya:");
					totalFood = scan.nextInt();
					if (menu.available(idFood-1, totalFood)) {
						valid = true;
					} else {
						System.out.println("Stok yang dipesan terlalu banyak!");
					}
				} while (valid == false);
				menu.order(idFood-1, totalFood);
			}
			System.out.println("Daftar Menu Setelah dipesan:");
		}
		
		scan.close();
		
		menu.tampilMenuMakanan();
		}
}
