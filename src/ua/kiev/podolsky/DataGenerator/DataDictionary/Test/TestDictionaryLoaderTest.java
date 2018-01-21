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
	void testColumns() {
		for(DatabaseTable t: list) {
			assertEquals(t.owner(), "TEST_OWNER");
			DatabaseTableColumnList cList = loader.loadColumns(t.owner(), t.name());
			assertEquals(cList.list().size(), 2);
		}
	}
}
		
