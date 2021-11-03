import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class LeetCodeThirdMax {
	public static int thirdMax(int[] nums) {
		int firstMaxValue = Integer.MIN_VALUE, secondMaxValue = Integer.MIN_VALUE, thirdMaxValue = Integer.MIN_VALUE;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] >= firstMaxValue) {
				firstMaxValue = nums[index];
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] >= secondMaxValue && nums[index] < firstMaxValue) {
				secondMaxValue = nums[index];
			}
		}
		boolean isThirdMaxValueFound = false;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] >= thirdMaxValue && nums[index] < secondMaxValue && nums[index] < firstMaxValue) {
				thirdMaxValue = nums[index];
				isThirdMaxValueFound = true;
			}
		}
		if (!isThirdMaxValueFound) {
			thirdMaxValue = firstMaxValue;
		}
		if (nums.length <= 2) {
			return firstMaxValue;
		}
		return thirdMaxValue;
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();

		for (int numberToFind = 1; numberToFind <= nums.length; numberToFind++) {
			if (!linearSearch(nums, numberToFind)) {
				list.add(numberToFind);
			}
		}
		System.out.println(list);
		return list;
	}

	private static boolean linearSearch(int[] nums, int numberToFind) {
		for (int i : nums) {
			if (numberToFind == i) {
				return true;
			}
		}
		return false;
	}
}
