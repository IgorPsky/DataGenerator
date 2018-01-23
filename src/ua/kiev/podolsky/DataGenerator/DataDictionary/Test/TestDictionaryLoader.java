package ua.kiev.podolsky.DataGenerator.DataDictionary.Test;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumnList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseType;

public class TestDictionaryLoader implements DataDictionaryLoader {

	class TestDatabaseTableColumn extends DatabaseTableColumn {

		public TestDatabaseTableColumn(DatabaseTable table, String name, DatabaseType type, int length,
				boolean isNullable) {
			super(table, name, type, length, isNullable);
		}
	}
	
	class TestDatabaseTable extends DatabaseTable {
		public TestDatabaseTable(String owner, String name) {
			super(owner, name);
		}

		@Override
		protected DatabaseTableColumnList createColumnList() {
			return new TestDatabaseTableColumnList();
		}
		
		@Override
		public TestDatabaseTableColumnList columns() {
			return (TestDatabaseTableColumnList)super.columns();
		}
		
	}

	class TestDatabaseTableList extends DatabaseTableList {
		@Override
		protected void addTable(DatabaseTable t) {
			super.addTable(t);
		}
	}
	
	class TestDatabaseTableColumnList extends DatabaseTableColumnList {
		@Override
		protected void addColumn(DatabaseTableColumn column) {
			super.addColumn(column);
		}
	}

	@Override
	public DatabaseTableList loadTables() {
		TestDatabaseTableList result = new TestDatabaseTableList();
		result.addTable(new DatabaseTable("TEST_OWNER", "TEST_TABLE1"));
		result.addTable(new DatabaseTable("TEST_OWNER", "TEST_TABLE2"));
		return result;
	}

	@Override
	public DatabaseTableColumnList loadColumns(DatabaseTable table) {
		if(table.name().equals("TEST_TABLE1")) {
			table.columns().addColumn(new TestDatabaseTableColumn(table, "ID", new DatabaseType(), 10, false));
			result.addColumn(new TestDatabaseTableColumn(table, "Name", new DatabaseType(), 255, false));
		} else if(table.name().equals("TEST_TABLE2")) {
			result.addColumn(new TestDatabaseTableColumn(table, "ID", new DatabaseType(), 10, false));
			result.addColumn(new TestDatabaseTableColumn(table, "Name", new DatabaseType(), 255, false));
		} else
			throw new RuntimeException("Table does not exist");
		return result;
	}

}