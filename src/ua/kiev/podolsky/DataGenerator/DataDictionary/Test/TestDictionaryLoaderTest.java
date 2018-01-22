package ua.kiev.podolsky.DataGenerator.DataDictionary.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumnList;

class TestDictionaryLoaderTest {
	
	TestDictionaryLoader loader = new TestDictionaryLoader();
	DatabaseTableList list = loader.loadTables();

	@Test
	void testTables() {
		assertEquals(list.size(), 2);
		for(DatabaseTable t: list) {
			assertEquals(t.owner(), "TEST_OWNER");
		}
	}

	
	@Test
	void testTable1() {
		assertNotNull(list.tableByName("test_owner", "test_table1"));
		assertNotNull(list.tableByName("test_OWNER", "TEST_table1"));
	}

	void testTable2() {
		assertNotNull(list.tableByName("test_owner", "test_table2"));
		assertNotNull(list.tableByName("test_OWNER", "test_TABLE2"));
	}
	
	@Test
	void testColumns() {
		assertNotNull(list.tableByName("test_owner", "test_table1").columns().columnByName("ID"));
	}
}
		
