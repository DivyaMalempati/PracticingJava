import java.util.HashSet;

public class ListPrograms {
	public static void subsetWithDuplicatesList(int[] nums) {

	}

	public static int arrayNesting(int[] nums) {
		int maxCount = 0;
		HashSet<Integer> indexSet = new HashSet<Integer>();
		for (int baseIndex = 0; baseIndex < nums.length; baseIndex++) {
			int count = 0;
			if (indexSet.contains(baseIndex)) {
				continue;
			}
			for (int index = baseIndex; index < nums.length;) {
				if (!indexSet.contains(index)) {
					indexSet.add(index);
					index = nums[index];
					count++;
				} else {
					break;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
		}
		return maxCount;
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int maxCount = Integer.MIN_VALUE;
		int onesCount = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 1) {
				onesCount++;
			} else {
				onesCount = 0;
			}
			if (onesCount > maxCount) {
				maxCount = onesCount;
			}
		}
		return maxCount;
	}

	public static int findNumbersWithEvenDigits(int[] nums) {
		int numbersCount = 0;
		for (int index = 0; index < nums.length; index++) {
			int temp = nums[index];
			int valueCount = 0;
			while (temp > 0) {
				temp /= 10;
				valueCount++;
			}
			if (valueCount % 2 == 0) {
				numbersCount++;
			}
		}
		return numbersCount;
	}

	public static int[] sortedSquares(int[] nums) {
		for (int index = 0; index < nums.length; index++) {
			nums[index] = (nums[index] * nums[index]);
		}
		for (int index = 0; index < nums.length; index++) {
			for (int jIndex = index + 1; jIndex < nums.length; jIndex++) {
				int temp = nums[index];
				if (temp > nums[jIndex]) {
					nums[index] = nums[jIndex];
					nums[jIndex] = temp;
				}
			}

		}
		return nums;
	}

	public static void duplicateZeros(int[] arr) {
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] == 0) {
				for (int jIndex = arr.length - 2; jIndex > index && index < arr.length; jIndex--) {
					arr[jIndex + 1] = arr[jIndex];
				}
				arr[index + 1] = 0;
				index++;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static boolean checkIfExist(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int jIndex = 0; jIndex < arr.length; jIndex++) {
				if (arr[index] == 2 * arr[jIndex] && index != jIndex) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean mountainArray(int[] arr) {
		if (arr.length >= 3) {
			int startIndex = 0, endIndex = arr.length - 1;
			while (startIndex <= endIndex) {
				if (arr[startIndex] < arr[startIndex++] || arr[endIndex] < arr[endIndex--]) {
					continue;
				} else if (arr[startIndex] == arr[startIndex++] || arr[endIndex] == arr[endIndex--]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
