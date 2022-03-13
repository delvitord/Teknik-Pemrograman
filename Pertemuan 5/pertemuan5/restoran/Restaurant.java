package restoran;


public class Restaurant {
	private Food[] foods;
	private static byte id=0;
	
	public Restaurant() {
		foods = new Food[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		foods[id] = new Food();
		this.foods[id].setNama_makanan(nama);
		this.foods[id].setHarga_makanan(harga);
		this.foods[id].setStok(stok);
	}
	
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(foods[i].getNama_makanan() +"["+foods[i].getStok()+"]"+"\tRp. "+foods[i].getHarga_makanan());
			}
		}
	}
	
	public boolean isOutOfStock(int id){
		if(foods[id].getStok() == 0){
			return true;
		}else{
			return false;
		}
	}
		
	public static void nextId(){
		id++;
	}
	
	/*Method untuk pemesanan, sehingga stok akan berkurang*/
	public void order(int id, int totalOrdered) {
		int totalInMenu = foods[id].getStok();
		totalInMenu -= totalOrdered;
		foods[id].setStok(totalInMenu);
	}
	
	/*Method untuk memvalidasi apakah stok memungkinkan jika dipesan*/
	public boolean available (int id, int totalOrdered) {
		if (foods[id].getStok() - totalOrdered < 0) {
			return false;
		} else {
			return true;
		}
	}

}
