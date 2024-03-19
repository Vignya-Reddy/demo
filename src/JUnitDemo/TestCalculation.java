package JUnitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculation {
	@Test
	public void testMax() {
		assertEquals(4,Calculation.calculateMax(new int[] {1,2,3,4}));
		assertEquals(-3,Calculation.calculateMax(new int[] {-9,-4,-3,-7}));
	}

}
