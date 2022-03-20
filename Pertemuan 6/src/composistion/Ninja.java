package composistion;

public class Ninja {
	public static void main(String[] args) {
		String name = "Narto";
		Jurus jurus = new Jurus("Angin", "Rasengan", "Seribu Bayangan" );
		
		System.out.println("Nama Ninja: " + name);
		System.out.println("Elemen: " + jurus.getElemen());
		System.out.println("Jurus: " + jurus.getSkill1() + " & " + jurus.getSkill2());
	}
}
