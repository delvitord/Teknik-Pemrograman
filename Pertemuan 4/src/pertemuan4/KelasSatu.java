package pertemuan4;

public class KelasSatu {
		{
			System.out.println(11);		//akan selalu didahulukan setelah static
		}
		
		static
		{
			System.out.println(2);		//selalu didahulukan dan hanya diakses sekali selama program berjalan
		}
		
		public KelasSatu(int i)
		{
			System.out.println(3);		//hanya akan muncul ketika methodnya memiliki parameter
		}
		
		public KelasSatu()
		{
			System.out.println(4);		//hanya akan muncul ketika methodnya tidak memiliki parameter
		}
}
