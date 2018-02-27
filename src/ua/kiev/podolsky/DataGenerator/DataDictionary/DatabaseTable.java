package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTable extends DatabaseObject {

	private final String owner;
	private final String name;

	private DatabaseTableColumnList columns = null;
	private DataDictionaryLoader loadedFrom = null;

	private DatabaseTable(String owner, String name) {
		super();
		this.owner = owner;
		this.name = name;
	}

	private DatabaseTable(String owner, String name, DataDictionaryLoader loadedFrom) {
		this(owner, name);
		this.loadedFrom = loadedFrom;
	}
	
	public static DatabaseTable create(String owner, String name) {
		return new DatabaseTable(owner, name);
	}
	
	public static DatabaseTable create(String owner, String name, DataDictionaryLoader loadedFrom) {
		return new DatabaseTable(owner, name, loadedFrom);
	}

	public String owner() {
		return this.owner;
	}

	public String name() {
		return this.name;
	}

	public DatabaseTableColumnList columns() {
		if (columns == null) {
			columns = createColumnList();
		}
		return columns;
	}

	public DatabaseTableColumn columnByName(String colName) {
		return columns().columnByName(colName);
	}

	public boolean isColumnsLoaded() {
		return !(columns == null);
	}

	protected DatabaseTableColumnList createColumnList() {
		if (isColumnsLoaded())
			throw new UnsupportedOperationException();
		
		DatabaseTableColumnList.Builder builder = DatabaseTableColumnList.createBuilder(this);
		for(DatabaseTableColumn c: loadedFrom.loadColumns(this)) {
			builder.add(c);
		}
		
		return builder.build();
	}

}
