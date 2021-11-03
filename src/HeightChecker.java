import java.util.Arrays;

public class HeightChecker {
	public static int heightChecker(int[] heights) {
		int[] expected = heights.clone();
		Arrays.sort(expected, 0, heights.length);
		int counter = 0;
		for (int index = 0; index < heights.length; index++) {
			if (expected[index] != heights[index]) {
				counter++;
			}
		}
		return counter;
	}
}