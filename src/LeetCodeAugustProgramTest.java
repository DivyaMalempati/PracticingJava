import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeetCodeAugustProgramTest {

	@Test
	void twoSumInArrayTest() {
		assertArrayEquals(new int[] { 1, 2 }, LeetCodeAugustProgram.twoSumInArray(new int[] { 3, 2, 4 }, 6));
		assertArrayEquals(new int[] { 0, 1 }, LeetCodeAugustProgram.twoSumInArray(new int[] { 2, 7, 11, 15 }, 9));
	}

	@Test
	void twoSumInArrayHashMapSetTest() {
		assertArrayEquals(new int[] { 1, 2 }, LeetCodeAugustProgram.twoSumInArrayHashMapSet(new int[] { 3, 2, 4 }, 6));
		assertArrayEquals(new int[] { 0, 1 },
				LeetCodeAugustProgram.twoSumInArrayHashMapSet(new int[] { 2, 7, 11, 7, 15 }, 9));
	}
}
