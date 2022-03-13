package pertemuantiga;

import java.util.Scanner;

public class InputOutput {							
//program ini berfungsi untuk membagi-bagi kalimat jika ada karakter "[ !,?._'@]"
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String sentence;

		sentence = scan.nextLine();
		
		scan.close();

		String wordsOfSentence[] = sentence.split("[ !,?._'@]");		//untuk membagi-bagi kalimat jika ada karakter-karakter tersebut
		
		int totalWords = wordsOfSentence.length;

		System.out.println(totalWords);
		
		for (int i = 0; i < totalWords; i++) {
			System.out.println(wordsOfSentence[i]);
		}

	}
}
