package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ListIterator;
import java.util.Map;

public class DatabaseTableList extends AbstractSet<DatabaseTable>{
	
	private class TableNamePair {
		private String owner;
		private String name;
		TableNamePair(String owner, String name) {
			this.owner = owner;
			this.name = name;
		}
		
		TableNamePair(DatabaseTable t) {
			this.owner = t.owner();
			this.name = t.name();
		}
		
		public String qualifiedName() {
			return (owner + "." + name).toLowerCase();
		}
		
		@Override
		public boolean equals(Object that) {
			if(this == that) return true;
			if(that instanceof TableNamePair) {
				final TableNamePair aThat = (TableNamePair)that;
				return (this.qualifiedName().equals(aThat.qualifiedName()));
			}
			return false;
		}

		@Override
		public int hashCode() {
			return qualifiedName().hashCode();
		}
	}

	private Map<TableNamePair, DatabaseTable> intList = new HashMap<>();
	protected Map<TableNamePair, DatabaseTable> list() {return intList;}
	
	class TableIterator implements Iterator<DatabaseTable>{
		
		private final Iterator<DatabaseTable> iter = intList.values().iterator();
		
		@Override
		public boolean hasNext() {
			return iter.hasNext();
		}

		@Override
		public DatabaseTable next() {
			return iter.next();
		}
	}

	@Override
	public Iterator<DatabaseTable> iterator() {
		return new TableIterator();
	}
	
	public DatabaseTable tableByName(String owner, String name) {
		return intList.get(new TableNamePair(owner, name));
	}
	
	protected void addTable(DatabaseTable table) {
		intList.put(new TableNamePair(table), table);
	}

	@Override
	public int size() {
		return intList.size();
	}

}