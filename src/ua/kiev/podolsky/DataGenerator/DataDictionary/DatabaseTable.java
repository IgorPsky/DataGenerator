package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTable extends DatabaseObject {

	private final String owner;
	private final String name;

	private DatabaseTableColumnList columns = null;
	private DataDictionaryLoader loadedFrom = null;

	public DatabaseTable(String owner, String name) {
		super();
		this.owner = owner;
		this.name = name;
	}

	public DatabaseTable(String owner, String name, DataDictionaryLoader loadedFrom) {
		this(owner, name);
		this.loadedFrom = loadedFrom;
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
		DatabaseTableColumnList result = new DatabaseTableColumnList();
		result.loadFrom(this, loadedFrom);
		return result;
	}

}
