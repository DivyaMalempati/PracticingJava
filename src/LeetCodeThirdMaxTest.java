import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LeetCodeThirdMaxTest {

	@Test
	public void thirdMaxTest() {
		assertEquals(LeetCodeThirdMax.thirdMax(new int[] { 2, 2, 3, 1 }), 1);
		assertEquals(LeetCodeThirdMax.thirdMax(new int[] { 2, 3, 1 }), 1);
		assertEquals(LeetCodeThirdMax.thirdMax(new int[] { 1, 2, 1 }), 2);
		assertEquals(LeetCodeThirdMax.thirdMax(new int[] { 1, 2, -2147483648 }), -2147483648);
	}

	@Test
	public void findDisappearedNumbersTest() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		assertEquals(LeetCodeThirdMax.findDisappearedNumbers(new int[] { 1, 1, 2 }), list);
		list = new ArrayList<>();
		list.add(5);
		list.add(6);
		assertEquals(LeetCodeThirdMax.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }), list);
	}
}
