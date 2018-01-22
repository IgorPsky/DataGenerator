package ua.kiev.podolsky.DataGenerator.DataDictionary.Test;

import java.util.Map;
import java.util.Set;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumnList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseType;

public class TestDictionaryLoader implements DataDictionaryLoader {

	class TestDatabaseTableColumn extends DatabaseTableColumn {

		public TestDatabaseTableColumn(String name, DatabaseType type, int length, boolean isNullable) {
			super(name, type, length, isNullable);
		}

		@Override
		public String getRandomValue() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	class TestDatabaseTableList extends DatabaseTableList {
		@Override
		protected void addTable(DatabaseTable t) {
			super.addTable(t);
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
	public DatabaseTableColumnList loadColumns(String owner, String tableName) {
		return null;
	}

}
