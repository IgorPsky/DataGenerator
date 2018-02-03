package ua.kiev.podolsky.DataGenerator;

import java.util.Random;
import java.util.logging.Logger;

public class Utils {
	public static final Random random = new Random(47);
	public static final Logger LOGGER = Logger.getLogger("DataGenerator");
	public static final char QUOTE = '\'';
	public static final char DOUBLEQUOTE = '"';
	public static String StrDoublequote(String s) {
		return DOUBLEQUOTE + s + DOUBLEQUOTE;
	}
	public static String StrQuote(String s) {
		return QUOTE + s + QUOTE;
	}

}

