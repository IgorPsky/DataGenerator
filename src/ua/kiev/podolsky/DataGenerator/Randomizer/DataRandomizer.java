package ua.kiev.podolsky.DataGenerator.Randomizer;

import java.util.Random;

public interface DataRandomizer<T> {
	public abstract T getNext();
	
	static final Random RAND = new Random(47);
}
