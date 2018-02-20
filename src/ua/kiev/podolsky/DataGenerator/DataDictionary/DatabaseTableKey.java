package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.Set;

enum KeyType {PRIMARY, UNIQUE, FOREIGN};

public class DatabaseTableKey extends DatabaseObject{
	private final DatabaseTable table;
	private String name;
	private KeyType type;
	private DatabaseTableColumnList cols = new DatabaseTableColumnList();
	
	public DatabaseTableKey(DatabaseTable table, String name, KeyType type) {
		this.table = table;
		this.name = name;
	}
	
	public DatabaseTable table() {
		return this.table;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String owner() {
		return table.owner();
	}

}
