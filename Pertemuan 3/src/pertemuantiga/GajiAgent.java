package pertemuantiga;

import java.util.Scanner;

public class GajiAgent {
	/*
	 * Deskripsi program: Dalam sebuah agent penjualan. Agent akan menerima gaji
	 * pokok sebesar Rp.500.000,00 perbulan. Agent akan menerima bonus penjualan
	 * sebesar 25% dari total penjualan item jika berhasil menjual minimal 40 item.
	 * Agent akan menerima bonus penjualan 35% dari total penjualan jika berhasil
	 * menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item akan
	 * menerima denda pemotongan gajih pokok sebesar 15% dari total minus penjualan
	 * ke 15 item. Selain itu agen hanya menerima bonus 10% setiap itemnya. Harga
	 * setiap item adalah Rp. 50.000,00
	 */

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int baseSalary = 500000;		//gaji pokok
		final int itemPrice = 50000;		//harga item
		int item = sc.nextInt();
		
		sc.close();
		
		int finalSalary;
		
		if (item > 80) {
			finalSalary = baseSalary + (35 * (item * itemPrice) / 100);
		} else if (item > 40) {
			finalSalary = baseSalary + (25 * (item * itemPrice) / 100);
		} else if (item >= 15) {
			finalSalary = baseSalary + (10 * (item * itemPrice) / 100);
		} else {
			finalSalary = baseSalary - (15 * ((15-item) * itemPrice) / 100);
		}

		System.out.println(finalSalary);
		
	}
}
