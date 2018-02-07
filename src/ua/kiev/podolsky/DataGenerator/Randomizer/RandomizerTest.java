package ua.kiev.podolsky.DataGenerator.Randomizer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomizerTest {

	@Test
	void testNumber() {
		Randomizer.Number randNum = new Randomizer.Number(1, 100);
		for(int i=1;i<1000;i++) {
			int next = randNum.getNext();
			assertTrue(next >= 1);
			assertTrue(next <= 100);
		}
	}
	
	@Test
	void testCountingNumber() {
		Randomizer.CountingNumber randNum = new Randomizer.CountingNumber(10);
		assertEquals(10, randNum.getNext().intValue());
		assertEquals(11, randNum.getNext().intValue());
	}

}
