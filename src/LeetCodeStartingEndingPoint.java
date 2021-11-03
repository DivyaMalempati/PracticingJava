
public class LeetCodeStartingEndingPoint {

	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[2];
		result[0] = startingToEndingDuplicateValues(nums, target);
		result[1] = getEndingIndexDuplicateValues(nums, target);
		return result;

	}

	public static int startingToEndingDuplicateValues(int[] nums, int value) {
		int startingPoint = 0, endingPoint = nums.length - 1;
		while (startingPoint < endingPoint) {
			int midPoint = (startingPoint + endingPoint) / 2;
			if (nums[midPoint] < value) {
				startingPoint = midPoint + 1;
			} else if (nums[midPoint] > value) {
				endingPoint = midPoint - 1;
			} else {
				if (midPoint == 0 || nums[midPoint - 1] < value) {
					return midPoint;
				} else {
					endingPoint = midPoint - 1;
				}
			}
		}
		return -1;
	}

	public static int getEndingIndexDuplicateValues(int[] nums, int value) {
		int startingPoint = 0, endingPoint = nums.length - 1;
		while (startingPoint < endingPoint) {
			int midPoint = (startingPoint + endingPoint) / 2;
			if (nums[midPoint] < value) {
				startingPoint = midPoint + 1;
			} else if (nums[midPoint] > value) {
				endingPoint = midPoint;
			} else {
				if (midPoint == nums.length - 1 || nums[midPoint + 1] > value) {
					return midPoint;
				} else {
					startingPoint = midPoint + 1;
				}
			}
		}
		return -1;
	}

}
