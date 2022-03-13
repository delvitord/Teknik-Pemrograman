package pertemuantiga;

import java.util.Scanner;

public class Berhitung {
//program ini seperti kalkulator sederhana yang akan mengolah operasi +, -, *, /, dan %
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int number1, number2, result = 0;
		char operator;

		number1 = scan.nextInt();
		operator = scan.next().charAt(0);
		number2 = scan.nextInt();
		
		scan.close();

		switch (operator) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
			break;
		case '%':
			result = number1 % number2;
			break;
		}
		
		System.out.println(result);

	}
}
