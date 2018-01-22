package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DatabaseTableColumnList extends AbstractSet<DatabaseTableColumn> {
	private List<DatabaseTableColumn> intList = new ArrayList<>(); 
    protected Collection<DatabaseTableColumn> list() {return intList;}
	class ColIterator implements Iterator<DatabaseTableColumn> {
		
		Iterator<DatabaseTableColumn> iter = intList.iterator();

		@Override
		public boolean hasNext() {
			return iter.hasNext();
		}

		@Override
		public DatabaseTableColumn next() {
			return iter.next();
		}
	}
	
	@Override
	public Iterator<DatabaseTableColumn> iterator() {
		return new ColIterator();
	}
	@Override
	public int size() {
		return intList.size();
	}
}
