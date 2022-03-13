package anime;

public class Sasuke extends Itachi {
	String Dojutsu= "Sharingan";
	
	void printDojutsu() { 
		System.out.println(this.Dojutsu); 
		super.printDojutsu();		//bagian ini yang ditambahkan
	}
}
