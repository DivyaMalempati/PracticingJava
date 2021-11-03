import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListProgramsTest {

	@Test
	void checkIfExistTest() {
		assertTrue(ListPrograms.checkIfExist(new int[] { 10, 2, 5, 7 }));
		assertTrue(ListPrograms.checkIfExist(new int[] { 20, 12, 10, 7 }));
		assertFalse(ListPrograms.checkIfExist(new int[] { 2, 5, 7 }));
		assertTrue(ListPrograms.checkIfExist(new int[] { 2, 5, 7, 14 }));
		assertTrue(ListPrograms.checkIfExist(new int[] { 7, 1, 14, 11 }));
	}

	@Test
	void mountainArrayTest() {
		assertTrue(ListPrograms.mountainArray(new int[] { 0, 3, 2, 1 }));
		assertTrue(ListPrograms.mountainArray(new int[] { 0, 3, 5, 2, 1 }));
		assertFalse(ListPrograms.mountainArray(new int[] { 0, 3, 3, 5, 2, 1 }));
	}
}
