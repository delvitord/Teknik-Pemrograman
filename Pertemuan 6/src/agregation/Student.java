package agregation;

public class Student {
	private String name;
	private int NIM;
	Address address = new Address();
	
	
	Student(){
	}
	
	Student(String name, int NIM, int houseNumber, String street, int postalCode, String city){
		this.name = name;
		this.NIM = NIM;
		this.address.setHouseNumber(houseNumber);
		this.address.setStreet(street);
		this.address.setCity(city);
		this.address.setPostalCode(postalCode);
	}
	
	public void printStudent() {
		System.out.println("Name: " + this.name);
		System.out.println("NIM: " + this.NIM);
		System.out.println("Address: " + this.address.getHouseNumber() + 
				", " + this.address.getStreet() + 
				", " + this.address.getCity() + 
				", " + this.address.getPostalCode());
		
	}
}
