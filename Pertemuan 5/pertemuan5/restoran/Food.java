package restoran;

public class Food {
//Agar "Don’t use too many basic types in a class.", dibuat class baru
	
	private String nama_makanan;		//dijadikan private
	private double harga_makanan;		//dijadikan private
	private int stok;					//dijadikan private
	
	/*Constructor*/
	public Food() {
		//Always initialize data
		this.nama_makanan = "Kosong";		
		this.harga_makanan = 0;
		this.stok = 0;
	}
	
	public Food(String nama_makanan, double harga_makanan, int stok) {
		this.nama_makanan = nama_makanan;
		this.harga_makanan = harga_makanan;
		this.stok = stok;
	}
	
	/*Getter and Setter*/
	//nama_makan
	public String getNama_makanan() {
		return nama_makanan;
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	
	//harga_makanan
	public double getHarga_makanan() {
		return harga_makanan;
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	
	//Stok
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	
		
}
