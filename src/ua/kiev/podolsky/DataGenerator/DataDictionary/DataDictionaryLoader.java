package ua.kiev.podolsky.DataGenerator.DataDictionary;

public interface DataDictionaryLoader {
	public DatabaseTableList loadTables();
	public DatabaseTableColumnList loadColumns(String owner, String tableName);
}
