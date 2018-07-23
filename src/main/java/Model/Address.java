package model;

public class Address {
	private String City,Country;
	private int addressno;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getAddressno() {
		return addressno;
	}
	public void setAddressno(int addressno) {
		this.addressno = addressno;
	}
	public Address(String city, String country, int addressno) {
		super();
		City = city;
		Country = country;
		this.addressno = addressno;
	}
        public Address() {
		super();
		City = "";
		Country = "";
		this.addressno = -1;
	}
	
	
	
	
}
