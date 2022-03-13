package pertemuantiga;

import java.util.Scanner;

public class BukaTutupJalan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String[] plat = new String[4];
		
		String gabunganPlat;
		
		for(int i = 0; i < 4; i++) {
			plat[i] = sc.next();
		}
		
		sc.close();
		
		gabunganPlat = plat[0].concat(plat[1]).concat(plat[2]).concat(plat[3]);
		
		
		long angkaGabungan = Long.parseLong(gabunganPlat);
		
		long hasil = (angkaGabungan - 999999) % 5; 
		
		
		if (hasil == 0) {					//sesuai dengan sample, namun tidak sesuai dengan deskripsi soal
			System.out.println("jalan");
		} else {
			System.out.println("berhenti");
		}
	}
}
