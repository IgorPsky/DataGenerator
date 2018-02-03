package ua.kiev.podolsky.DataGenerator.DataDictionary;

import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataTypes.DatabaseTypeNumber;

public class DatabaseTableColumn {
	private final DatabaseTable table;
	private final String columnName;
	private final boolean isNullable;
	private final boolean isUnique;
	private final int length;
	private final DatabaseType type;

	public static class Builder {
		private final DatabaseTable table;
		private final String columnName;
		private boolean isNullable = true;
		private boolean isUnique = false;
		private int length = 10;
		private DatabaseType type = new DatabaseTypeNumber();
		public Builder(DatabaseTable table, String columnName) {
			this.table = table;
			this.columnName = columnName;
		}
		public Builder isNullable(boolean val) {this.isNullable = val; return this;}
		public Builder isUnique(boolean val) {this.isUnique = val; return this;}
		public Builder length(int val) {this.length = val; return this;}
		public Builder type(DatabaseType val) {this.type = val; return this;}
		public DatabaseTableColumn build() {
			return new DatabaseTableColumn(this);
		}
	}
	
	private DatabaseTableColumn(Builder b) {
		table = b.table;
		columnName = b.columnName;
		isNullable = b.isNullable;
		isUnique = b.isUnique;
		length = b.length;
		type = b.type;
	}
	
	public DatabaseTableColumn(DatabaseTable table, String name, DatabaseType type, int length, boolean isNullable,
			boolean isUnique) {
		columnName = name;
		this.isNullable = isNullable;
		this.length = length;
		this.type = type;
		this.table = table;
		this.isUnique = isUnique;
	}

	public String name() {
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
