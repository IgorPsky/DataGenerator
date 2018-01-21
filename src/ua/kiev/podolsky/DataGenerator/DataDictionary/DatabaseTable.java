package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTable extends DatabaseObject{
	private String owner;
	private String name;
	public DatabaseTable(String owner, String name){
		super();
		this.owner = owner;
		this.name = name;
	}
	public String owner() {return this.owner;};
	public String name() {return this.name;};
}
