package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTable extends DatabaseObject{
	
	private class IntDatabaseTableColumnList extends DatabaseTableColumnList {
		
	}
	
	private final String owner;
	private final String name;
	private final DatabaseTableColumnList columns;
	public DatabaseTable(String owner, String name){
		super();
		this.owner = owner;
		this.name = name;
		this.columns = createColumnList();
	}
	public String owner() {return this.owner;};
	public String name() {return this.name;};
	public DatabaseTableColumnList columns() {
		return columns;
	}
	public DatabaseTableColumn columnByName(String colName) {
		return columns().columnByName(colName);
	}
	protected DatabaseTableColumnList createColumnList() {
		return new IntDatabaseTableColumnList();
	}
	
}
