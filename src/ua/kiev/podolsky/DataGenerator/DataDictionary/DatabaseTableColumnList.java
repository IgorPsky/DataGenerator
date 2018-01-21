package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DatabaseTableColumnList implements Collection<DatabaseTableColumn> {
	private List<DatabaseTableColumn> intList = new ArrayList<>(); 
    protected Collection<DatabaseTableColumn> list() {return intList;}
	@Override
	public boolean add(DatabaseTableColumn e) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean addAll(Collection<? extends DatabaseTableColumn> c) {
		throw new UnsupportedOperationException();
	}
	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean contains(Object o) {
		return intList.contains(o);
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		return intList.containsAll(c);
	}
	@Override
	public boolean isEmpty() {
		return intList.isEmpty();
	}
	
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
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	@Override
	public int size() {
		return intList.size();
	}
	@Override
	public Object[] toArray() {
		return intList.toArray();
	}
	@Override
	public <T> T[] toArray(T[] a) {
		return intList.toArray(a);
	};
}
