package pertemuantiga;

import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {
//program ini untuk mengolah angka yang rangenya lebih besar dari tipe data long
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger number1, number2, jumlah, kali;
		String stringNumber; 
		
		stringNumber = sc.next();
		
		number1 = new BigInteger(stringNumber);
		
		stringNumber = sc.next();
		
		number2 = new BigInteger(stringNumber);
		
		sc.close();
		
		jumlah = number1.add(number2);		//penjumlahan
		
		kali = number1.multiply(number2);	//perkalian
		
		System.out.println(jumlah);
		System.out.println(kali);
		
		
	}
}
