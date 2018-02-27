package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.Collection;
import java.util.function.Predicate;

public interface DataDictionaryLoader extends AutoCloseable {
	public Iterable<DatabaseTable> loadTables(Collection<String> schemas, Predicate<DatabaseTable> filter);
	default public Iterable<DatabaseTable> loadTables(Collection<String> schemas){
		return loadTables(schemas, p -> true);
	};
	default public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table){
		return loadColumns(table, p -> true);
	}
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table, Predicate<DatabaseTableColumn> filter);
	default public Iterable<DatabaseTableKey> loadKeys(DatabaseTable table){
		return loadKeys(table, p -> true);
	}
	public Iterable<DatabaseTableKey> loadKeys(DatabaseTable table, Predicate<DatabaseTableKey> filter);
	public void close();
}
