import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RotatedArrayProgramTest {

	@Test
	void inRotatedArrayFindMinIndexTest() {
		assertEquals(RotatedArrayProgram.inRotatedArrayFindMinIndex(new Integer[] { 1, 2, 3, 4, 5 }), 0);
		assertEquals(RotatedArrayProgram.inRotatedArrayFindMinIndex(new Integer[] { 5, 1, 2, 3, 4 }), 1);
		assertEquals(RotatedArrayProgram
				.inRotatedArrayFindMinIndex(new Integer[] { 40, 90, 500, 540, 1000, 1001, 5, 7, 10, 20 }), 6);
		assertEquals(
				RotatedArrayProgram.inRotatedArrayFindMinIndex(new Integer[] { 40, 90, 500, 540, 1000, 5, 7, 10, 20 }),
				5);
	}

	@Test
	void findElementInRotatedArrayTest() {
		assertFalse(RotatedArrayProgram.findElementInRotatedArray(new Integer[] { 1, 2, 3, 4, 5 }, 0));
		assertTrue(RotatedArrayProgram.findElementInRotatedArray(new Integer[] { 1, 2, 3, 4, 5 }, 4));
		assertTrue(RotatedArrayProgram
				.findElementInRotatedArray(new Integer[] { 40, 90, 500, 540, 1000, 1001, 5, 7, 10, 20 }, 1000));
	}
}
