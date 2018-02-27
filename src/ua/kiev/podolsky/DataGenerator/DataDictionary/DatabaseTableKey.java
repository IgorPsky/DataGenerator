package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.Set;

enum KeyType {PRIMARY, UNIQUE, FOREIGN};

public class DatabaseTableKey extends DatabaseObject{
	private final DatabaseTable table;
	private String name;
	private KeyType type;
	private DatabaseTableColumnList cols;
	
	public DatabaseTableKey(DatabaseTable table, String name, KeyType type) {
		this.table = table;
		this.name = name;
		this.type = type;
		cols = DatabaseTableColumnList.create(table);
	}
	
	public DatabaseTable table() {
		return this.table;
	}
	
	public KeyType type() {
		return type;
	}
	
	public DatabaseTableColumnList columns() {
		return cols;
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
