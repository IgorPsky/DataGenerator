package ua.kiev.podolsky.DataGenerator.Randomizer;

public class Randomizer {
	static class Number implements DataRandomizer<Integer> {

		private final int LOWER_BOUND;
		private final int UPPER_BOUND;

		public Number() {
			LOWER_BOUND = 0;
			UPPER_BOUND = Integer.MAX_VALUE;
		}

		public Number(int lowerBound, int upperBound) {
			LOWER_BOUND = lowerBound;
			UPPER_BOUND = upperBound;
		}

		@Override
		public Integer getNext() {
			return RAND.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
		}
	}

	static class CountingNumber implements DataRandomizer<Integer> {
		private int curval;

		public CountingNumber() {
			curval = 1;
		}

		public CountingNumber(int startsWith) {
			curval = startsWith;
		}

		@Override
		public Integer getNext() {
			return curval++;
		}
	}

	static char[] chars = ("abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

	public static class CountingCharacter implements DataRandomizer<java.lang.Character> {
		int index = -1;

		public java.lang.Character getNext() {
			index = (index + 1) % chars.length;
			return chars[index];
		}
	}
	
	public static class Character implements DataRandomizer<java.lang.Character> {
		int index = -1;

		public java.lang.Character getNext() {
			index = RAND.nextInt(chars.length);
			return chars[index];
		}
	}
	
	public static class String implements DataRandomizer<java.lang.String> {
		
		private final byte LENGTH;
		
		public String() {
			LENGTH=7;
		}
		
		public String(byte length) {
			LENGTH=length;
		}
		
		protected byte getLength() {
			return LENGTH;
		}
		
		private Character c = new Character();

		@Override
		public java.lang.String getNext() {
			byte l = getLength();
			char[] s = new char[l];
			for(int i=0; i<l; i++) {
				s[i] = c.getNext();
			}
			return new java.lang.String(s);
		}
	}
	
	public static class RandomLengthString extends String {
		private final byte MAX_LENGTH;
		public RandomLengthString(byte maxLength) {
			MAX_LENGTH = maxLength;
		}
		public RandomLengthString() {
			this((byte) 11);
		}
		@Override
		protected byte getLength() {
			return (byte) (RAND.nextInt(MAX_LENGTH-1)+1);
		}
	}

	public static void main(java.lang.String[] args) {
		String randN = new RandomLengthString((byte)33);
		for (int i = 0; i < 100; i++) {
			System.out.println(randN.getNext());
		}
	}
}
