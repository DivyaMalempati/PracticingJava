import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ArrayProgramsTest {

	@Test
	void multiplicationOfArrayExceptSelfTest() {
		assertArrayEquals(ArraysPrograms.multiplicationOfArrayExceptSelf(new Integer[] { 1, 2, 3, 0 }),
				new Integer[] { 0, 0, 0, 6 });
		assertArrayEquals(ArraysPrograms.multiplicationOfArrayExceptSelf(new Integer[] { 1, 2, 0, 0 }),
				new Integer[] { 0, 0, 0, 0 });
		assertArrayEquals(ArraysPrograms.multiplicationOfArrayExceptSelf(new Integer[] { 1, 2, 3, 4 }),
				new Integer[] { 24, 12, 8, 6 });
		assertArrayEquals(ArraysPrograms.multiplicationOfArrayExceptSelf(new Integer[] { 1, 2, 3 }),
				new Integer[] { 6, 3, 2 });
	}

	@Test
	void sumOfKnumbersMaxInArrayTest() {
		assertEquals(ArraysPrograms.sumOfKnumbersMaxInArray(new Integer[] { 10, 3, 5, 10, 20 }, 2), 30);
	}

	@Test
	void reverseElementsInAnArrayTest() {
		assertArrayEquals(ArraysPrograms.reverseElementsInAnArray(new Integer[] { 0 }), new Integer[] { 0 });
		assertArrayEquals(ArraysPrograms.reverseElementsInAnArray(new Integer[] { 0, 1 }), new Integer[] { 1, 0 });
		assertArrayEquals(ArraysPrograms.reverseElementsInAnArray(new Integer[] { 0, 1, 1 }),
				new Integer[] { 1, 1, 0 });
		assertArrayEquals(ArraysPrograms.reverseElementsInAnArray(new Integer[] { 10, 3, 5, 10, 20 }),
				new Integer[] { 20, 10, 5, 3, 10 });
		assertArrayEquals(ArraysPrograms.reverseElementsInAnArray(new Integer[] { 10, 3, 4, 5, 10, 20 }),
				new Integer[] { 20, 10, 5, 4, 3, 10 });
	}

	@Test
	void arrayListTest() {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(2, 2);
		arrayList.add(20);
		arrayList.add(30);
		// arrayList.add(10,200);
		System.out.println(arrayList);

	}

	@Test
	void replaceElementsTest() {
		// assertArrayEquals(new int[] { 18, 6, 6, 6, 1, -1 },
		// ArraysPrograms.replaceElements(new int[] { 17, 18, 5, 4, 6, 1 }));
		assertArrayEquals(new int[] { 18, 6, 6, 6, 1, -1 },
				ArraysPrograms.replaceElementsMaxValue(new int[] { 17, 18, 5, 4, 6, 1 }));
	}

	@Test
	void moveZeroesTest() {
		ArraysPrograms.moveZeroes(new int[] { 0, 1, 0, 2, 13 });
		ArraysPrograms.moveZeroes(new int[] { 0, 1, 0, 2, 2, 0, 0, 0, 0, 13 });
		ArraysPrograms.moveZeroes(new int[] { 0 });
		ArraysPrograms.moveZeroes2(new int[] { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 });
	}

	@Test
	void moveZeroes2Test() {
		ArraysPrograms.moveZeroes2(new int[] { 0, 1, 0, 2, 13 });
		ArraysPrograms.moveZeroes2(new int[] { 0, 1, 0, 2, 2, 0, 0, 0, 0, 13 });
		ArraysPrograms.moveZeroes2(new int[] { 0 });
		ArraysPrograms.moveZeroes2(new int[] { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 });

	}

	@Test
	void sortArrayByParityTest() {
		assertArrayEquals(new int[] { 2, 4, 1, 3 }, ArraysPrograms.sortArrayByParity(new int[] { 3, 1, 2, 4 }));
		assertArrayEquals(new int[] { 0 }, ArraysPrograms.sortArrayByParity(new int[] { 0 }));
	}
}
