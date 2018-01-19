package ua.kiev.podolsky.DataGenerator.DataDictionary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDictionaryConnector implements DataDictionaryConnector {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	class TestDatabaseTableColumn extends DatabaseTableColumn {

		public TestDatabaseTableColumn(String name, int length, boolean isNullable) {
			super(name, length, isNullable);
		}

		@Override
		public String getRandomValue() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	@Override
	public DatabaseTableList listTables(String whereCondition) {
		DatabaseTableList result = new DatabaseTableList();
		result.List().add(new DatabaseTable("TEST_OWNER", "TEST_TABLE1", this));
		result.List().add(new DatabaseTable("TEST_OWNER", "TEST_TABLE2", this));
		return result;
	}

	@Override
	public DatabaseTableColumnList listColumns(DatabaseTable table, String whereCondition) {
		DatabaseTableColumnList result = new DatabaseTableColumnList();
		if(table.name().equals("TEST_TABLE1")&&table.owner().equals("TEST_OWNER")) {
			result.list().add(new TestDatabaseTableColumn("ID", 10, false));
			result.list().add(new TestDatabaseTableColumn("NAME", 255, true));
		} else if (table.name().equals("TEST_TABLE2")&&table.owner().equals("TEST_OWNER")) {
			
		} else
			throw new RuntimeException("Table not supported by test");
		return result;
	}

}
