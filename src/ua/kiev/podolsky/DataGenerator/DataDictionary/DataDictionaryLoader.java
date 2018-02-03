package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.Collection;

public interface DataDictionaryLoader extends AutoCloseable {
	public Iterable<DatabaseTable> loadTables(Collection<String> schemas);
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table);
	public void close();
}
