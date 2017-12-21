package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ua.kiev.podolsky.DataGenerator.DataConnector.DataConnector;

public class DatabaseTable extends DatabaseObject{
	private String owner;
	private String name;
	private DataConnector connector;
	private List<DatabaseTableColumn> columns;
	DatabaseTable(String owner, String name, DataConnector connector){
		super();
		this.owner = owner;
		this.name = name;
		this.connector = connector;
		this.columns = new ArrayList<DatabaseTableColumn>();
	}
	public String owner() {return this.owner;};
	public String name() {return this.name;};
	public DataConnector connector() {return this.connector;};
	public List<DatabaseTableColumn> columns() {return columns;}
}
