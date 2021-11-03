import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElementSearchUsingBinarySearchTest {

	@Test
	void binarySearchOnELementTest() {
		assertTrue(ElementSearchUsingBinarySearch.binarySearchOnELement(new Integer[] {1,3,5,6},1));
		assertTrue(ElementSearchUsingBinarySearch.binarySearchOnELement(new Integer[] {1,3,5,6,7},7));
		assertFalse(ElementSearchUsingBinarySearch.binarySearchOnELement(new Integer[] {1,3,5,6,7},10));
		assertFalse(ElementSearchUsingBinarySearch.binarySearchOnELement(new Integer[] {1,3,5,6,7},0));
	}
}
