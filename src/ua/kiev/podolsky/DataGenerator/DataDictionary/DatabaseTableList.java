package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ListIterator;

public class DatabaseTableList implements Set<DatabaseTable>{
	private Set<DatabaseTable> intList = new HashSet<DatabaseTable>();
	protected Set<DatabaseTable> list() {return intList;}
	
	@Override
	public int size() {
		return intList.size();
	}
	@Override
	public boolean isEmpty() {
		return intList.isEmpty();
	}
	@Override
	public boolean contains(Object o) {
		return intList.contains(o);
	}

	
	class TableIterator implements Iterator<DatabaseTable>{

		@Override
		public boolean hasNext() {
			return intList.iterator().hasNext();
		}

		@Override
		public DatabaseTable next() {
			return intList.iterator().next();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}

	@Override
	public Iterator<DatabaseTable> iterator() {
		return new TableIterator();
	}
	@Override
	public Object[] toArray() {
		return intList.toArray();
	}
	@Override
	public <T> T[] toArray(T[] a) {
		intList.toArray(a);
		return null;
	}
	@Override
	public boolean add(DatabaseTable o) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		return intList.containsAll(c);
	}
	@Override
	public boolean addAll(Collection<? extends DatabaseTable> c) {
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
	public void clear() {
		throw new UnsupportedOperationException();
	}
}