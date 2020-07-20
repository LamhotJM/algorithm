package lab2.problem3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class Problem11Test {

	private Problem11 fibonacci;

	@Before
	public void setUp() {
		fibonacci = new Problem11();
	}

	@Test
	public void calculate_0() {
		int input = 10;
		int expectedResult = 55;

		assertEquals(expectedResult, fibonacci.fibonacci(input));
	}

	@Test
	public void testFibMinusOne() {
		boolean caught = false;
		try {
			fibonacci.fibonacci(Integer.MIN_VALUE);
		} catch (IllegalArgumentException e) {
			caught = true;
		}
		assertTrue(caught);
	}


}
