package pertemuantiga;

import java.util.Scanner;

public class InputOutput2 {
//program ini akan output text yang format posisinya teratur dan menampilkan angka 3 digit	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String[] word = new String[3];
		int[] number = new int[3];
		int i;
		
		for (i = 0; i < 3; i++) {
			word[i] = sc.next();
			number[i] = sc.nextInt();
		}

		System.out.println("================================");
		
		for (i = 0; i < 3; i++) {
			System.out.printf("%-15s%03d\n", word[i], number[i]);
		}
		System.out.println("================================");

	}
}
