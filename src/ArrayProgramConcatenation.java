import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayProgramConcatenation {
	public int[] getConcatenation(int[] nums) {
		int[] a = new int[nums.length * 2];
		int startIndex = 0;
		while (startIndex < nums.length) {
			a[startIndex] = a[nums.length + startIndex] = nums[startIndex];
			startIndex++;
		}
		System.out.print("{");
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println("}");
		return a;
	}

	@Test
	public void getConcatenationTest() {
		assertArrayEquals(new int[] { 1, 2, 3, 1, 1, 2, 3, 1 }, getConcatenation(new int[] { 1, 2, 3, 1 }));
		assertArrayEquals(new int[] { 1, 2, 1, 1, 2, 1 }, getConcatenation(new int[] { 1, 2, 1 }));
	}
}
