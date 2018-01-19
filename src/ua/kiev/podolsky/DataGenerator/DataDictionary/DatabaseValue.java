package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseValue<T> {
	T value;
	public T get() {return value;}
	public void set(T value) {this.value = value;}
	public DatabaseValue(T value) {
		set(value);
	}
}
