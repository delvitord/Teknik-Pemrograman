package agregation;

public class Lecturer {
	private String name;
	private int NIP;
	Address address = new Address();
	
	
	Lecturer(){
	}
	
	Lecturer(String name, int NIP, int houseNumber, String street, int postalCode, String city){
		this.name = name;
		this.NIP = NIP;
		this.address.setHouseNumber(houseNumber);
		this.address.setStreet(street);
		this.address.setCity(city);
		this.address.setPostalCode(postalCode);
	}
	
	public void printLecturer() {
		System.out.println("Name: " + this.name);
		System.out.println("NIP: " + this.NIP);
		System.out.println("Address: " + this.address.getHouseNumber() + 
				", " + this.address.getStreet() + 
				", " + this.address.getCity() + 
				", " + this.address.getPostalCode());
		
	}
}
