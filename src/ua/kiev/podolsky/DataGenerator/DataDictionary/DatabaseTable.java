package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ua.kiev.podolsky.DataGenerator.DataConnector.DataConnector;

public class DatabaseTable extends DatabaseObject{
	private String owner;
	private String name;
	private DataDictionaryConnector connector;
	private DatabaseTableColumnList columns = null;
	public DatabaseTable(String owner, String name, DataDictionaryConnector connector){
		super();
		this.owner = owner;
		this.name = name;
		this.connector = connector;
	}
	public String owner() {return this.owner;};
	public String name() {return this.name;};
	public DataDictionaryConnector connector() {return this.connector;};
	public DatabaseTableColumnList columns() {
		if (columns == null) {
			columns = connector.listColumns(this, "0=0");
		}
        return columns;
	}
}
