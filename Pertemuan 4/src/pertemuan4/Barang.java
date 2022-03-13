package pertemuan4;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;		//Agar stok tidak mudah diakses, dilakukan encapsulation
	
	public Barang(String kode, String nama, int stk) { 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}
	
	
	//dibuat getter and setter untuk stok
	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}
	
	//agar stok bisa ditambahkan
	public void addStok(int jumlah) {
		this.stok += jumlah;
	}
}
