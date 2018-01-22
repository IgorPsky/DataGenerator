package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTable extends DatabaseObject{
	
	private class IntDatabaseTableColumnList extends DatabaseTableColumnList {
		
	}
	
	private String owner;
	private String name;
	private IntDatabaseTableColumnList columns = new IntDatabaseTableColumnList();
	public DatabaseTable(String owner, String name){
		super();
		this.owner = owner;
		this.name = name;
	}
	public String owner() {return this.owner;};
	public String name() {return this.name;};
	public DatabaseTableColumnList columns() {
		return columns;
	}
	public DatabaseTableColumn columnByName(String colName) {
		return columns().columnByName(colName);
	}
}
