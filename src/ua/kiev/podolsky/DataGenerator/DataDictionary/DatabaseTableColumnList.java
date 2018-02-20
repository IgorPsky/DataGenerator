package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DatabaseTableColumnList extends AbstractSet<DatabaseTableColumn> {
	
	private Map<String, DatabaseTableColumn> intList = new HashMap<>(); 
    protected Collection<DatabaseTableColumn> list() {return intList.values();}
	class ColIterator implements Iterator<DatabaseTableColumn> {
		
		Iterator<DatabaseTableColumn> iter = intList.values().iterator();

		@Override
		public boolean hasNext() {
			return iter.hasNext();
		}

		@Override
		public DatabaseTableColumn next() {
			return iter.next();
		}
	}
	
	protected void addColumn(DatabaseTableColumn column) {
		intList.put(column.name(), column);
	}
	
	@Override
	public Iterator<DatabaseTableColumn> iterator() {
		return new ColIterator();
	}
	@Override
	public int size() {
		return intList.size();
	}
	
	public DatabaseTableColumn columnByName(String colName) {
		return intList.get(colName);
	}
	
	public void loadFrom(DatabaseTable table, DataDictionaryLoader loader) {
		for(DatabaseTableColumn c: loader.loadColumns(table)) {
			addColumn(c);
		}
	}
	
	protected DatabaseTableColumnList() {
		
	}
	
	private DatabaseTableColumnList(Set<DatabaseTableColumn> cols) {
		this();
		for(DatabaseTableColumn c: cols) {
			addColumn(c);
		}
	}
	
	public static class Builder {
		private Set<DatabaseTableColumn> columns = new HashSet<>();
		public Builder add(DatabaseTableColumn c) {
			columns.add(c);
			return this;
		}
		public DatabaseTableColumnList build() {
			DatabaseTableColumnList result = new DatabaseTableColumnList(columns);
			return result;
		}
	}
}
