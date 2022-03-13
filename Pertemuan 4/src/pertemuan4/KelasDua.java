package pertemuan4;

public class KelasDua {
	{
		System.out.println(5);
	}
	
	public static void main(String[] args)
	{
		System.out.println(6);				//urutan pertama
		KelasSatu satu = new KelasSatu(); 
		KelasSatu dua = new KelasSatu(10);
	}
}

/*
 * Block yang static akan selalu didahulukan dari apapun, namun hanya dieksekusi
 * sekali selama program berjalan. Setelah itu adalah Instance Initialization
 * Block yang akan mendahului block lainnya
 */