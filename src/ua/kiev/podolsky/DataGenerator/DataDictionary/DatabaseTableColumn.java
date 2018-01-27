package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTableColumn {
	private final DatabaseTable table;
	private final String columnName;
	private final boolean isNullable;
	private final boolean isUnique;
	private final int length;
	private final DatabaseType type;

	public DatabaseTableColumn(DatabaseTable table, String name, DatabaseType type, int length, boolean isNullable,
			boolean isUnique) {
		columnName = name;
		this.isNullable = isNullable;
		this.length = length;
		this.type = type;
		this.table = table;
		this.isUnique = isUnique;
	}

	public String Name() {
		return columnName;
	}

	public int length() {
		return length;
	}

	public boolean isNullable() {
		return isNullable;
	}

	public DatabaseType type() {
		return type;
	}
	
	public boolean isUnique() {
		return isUnique;
	}

	public String getRandomValue() {
		return "";
	}

	public static DatabaseTableColumn createColumn(DatabaseTable table, String name, DatabaseType type, int size) {
		return new DatabaseTableColumn(table, name, type, size, true, false);
	}
}
