package agregation;

public class Address {
	private int houseNumber;
	private String street;
	private int postalCode;
	private String city;
	
	Address(){	
	}
	
	Address(int houseNumber, String street, int postalCode, String city){
		this.houseNumber = houseNumber;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
