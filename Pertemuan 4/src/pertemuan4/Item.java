package pertemuan4;

public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) { 
		this();							//hanya menambahkan ini. Fungsinya untuk mengakses constructor
		System.out.println(this.name);
	}
}


/*
 * Maka cara agar bisa mengeluarkan nama "Ipin", kita harus mengakses
 * constructor yang pertama (yang di dalamnya ada pemberian value "Ipin") di constructor yang kedua
 */

