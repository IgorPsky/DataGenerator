package ua.kiev.podolsky.DataGenerator.DataDictionary;

public abstract class DatabaseObject {
	public static String composeName(String owner, String name) {
		return owner + "." + name;
	}
	
	public abstract String name();
	public abstract String owner();
}
