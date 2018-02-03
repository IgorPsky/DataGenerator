package ua.kiev.podolsky.DataGenerator;

import java.util.Random;
import java.util.logging.Logger;

public class Utils {
	public static final Random random = new Random(47);
	public static final Logger LOGGER = Logger.getLogger("DataGenerator");
	public static final char QUOTE = '\'';
	public static final char DOUBLEQUOTE = '"';
	public static String StrSurround(String s, String surroundString) {
		return surroundString + s + surroundString;
	}
	public static String StrSurround(String s, char surroundChar) {
		return surroundChar + s + surroundChar;
	}
	public static String StrDoublequote(String s) {
		return StrSurround(s, DOUBLEQUOTE);
	}
	public static String StrQuote(String s) {
		return StrSurround(s, QUOTE);
	}
}

