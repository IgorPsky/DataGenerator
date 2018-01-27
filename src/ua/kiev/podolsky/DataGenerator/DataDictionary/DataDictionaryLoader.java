package ua.kiev.podolsky.DataGenerator.DataDictionary;

public interface DataDictionaryLoader {
	public Iterable<DatabaseTable> loadTables();
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table);
}
