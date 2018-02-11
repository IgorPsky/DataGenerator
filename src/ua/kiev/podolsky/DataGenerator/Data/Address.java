package ua.kiev.podolsky.DataGenerator.Data;

public class Address {
	public final City city;
	public final String street;
	public final String streetNo;
	
	private Address(City city, String street, String streetNo) {
		this.city = city;
		this.street = street;
		this.streetNo = streetNo;
	}
}
