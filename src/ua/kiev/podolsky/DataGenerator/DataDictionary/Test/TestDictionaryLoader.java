package ua.kiev.podolsky.DataGenerator.DataDictionary.Test;

import java.util.ArrayList;
import java.util.List;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataTypes.DatabaseTypeNumber;
import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataTypes.DatabaseTypeString;

public class TestDictionaryLoader implements DataDictionaryLoader {

	@Override
	public List<DatabaseTable> loadTables() {
		List<DatabaseTable> result = new ArrayList<>();
		result.add(new DatabaseTable("TEST_OWNER", "TEST_TABLE1", this));
		result.add(new DatabaseTable("TEST_OWNER", "TEST_TABLE2", this));
		return result;
	}

	@Override
	public List<DatabaseTableColumn> loadColumns(DatabaseTable table) {
		List<DatabaseTableColumn> result = new ArrayList<>();
		if(table.name().equals("TEST_TABLE1")) {
			result.add(DatabaseTableColumn.createColumn(table, "ID", new DatabaseTypeNumber(), 10));
			result.add(DatabaseTableColumn.createColumn(table, "Name", new DatabaseTypeString(), 255));
		} else if(table.name().equals("TEST_TABLE2")) {
			result.add(DatabaseTableColumn.createColumn(table, "ID", new DatabaseTypeNumber(), 10));
			result.add(DatabaseTableColumn.createColumn(table, "Name", new DatabaseTypeString(), 255));
		} else
			throw new RuntimeException("Table does not exist");
		return result;
	}

	@Override
	public void close() {
	}

}