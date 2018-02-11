package ua.kiev.podolsky.DataGenerator.Data;

public class City {
	private final Country country;
	private final State state;
	private final String name;
	private City(Country country, State state, String name) {
		this.country = country;
		this.state = state;
		this.name = name;
	}
}
