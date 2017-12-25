package ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL;

import ua.kiev.podolsky.DataGenerator.DataConnector.DataConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumnList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;

public class MySQLDictionaryConnector implements DataDictionaryConnector {
	private DataConnector dc;
	MySQLDictionaryConnector(DataConnector dc) {
		this.dc = dc;
	}
	@Override
	public DatabaseTableList listTables(String whereCondition) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DatabaseTableColumnList listColumns(DatabaseTable table) {
		// TODO Auto-generated method stub
		return null;
	}

}
