package ua.kiev.podolsky.DataGenerator.DataDictionary;

public interface DataDictionaryLoader extends AutoCloseable {
	public Iterable<DatabaseTable> loadTables();
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table);
	public void close();
}
