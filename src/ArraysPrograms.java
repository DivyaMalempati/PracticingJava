import java.util.Arrays;

public class ArraysPrograms {
	public static Integer[] multiplicationOfArrayExceptSelf(Integer[] nums) {
		if (nums.length == 1) {
			throw new RuntimeException("" + nums);
		} else {
			Integer[] resultArray = new Integer[nums.length];
			int result = 1, countZeroes = 0;
			for (int index = 0; index < nums.length; index++) {
				if (nums[index] != 0) {
					result *= nums[index];
				} else {
					countZeroes++;
				}
			}
			if (countZeroes == 1) {
				for (int index = 0; index < nums.length; index++) {
					if (nums[index] == 0) {
						resultArray[index] = result;
					} else {
						resultArray[index] = 0;
					}
				}
			} else if (countZeroes >= 2) {
				for (int index = 0; index < nums.length; index++) {
					resultArray[index] = 0;
				}
			} else {
				for (int index = 0; index < nums.length; index++) {
					resultArray[index] = result / nums[index];
				}

			}
			return resultArray;
		}

	}

	/*
	 * public static int sumOfKnumbersMaxInArray(Integer[] array, int k) { int
	 * fixedSum = 0, maxSum = Integer.MIN_VALUE; for (int index = 0; index < k;
	 * index++) { fixedSum += array[index]; } for (int windowStart = 1, windowEnd =
	 * k; windowEnd < array.length; windowStart++, windowEnd++) { fixedSum =
	 * fixedSum + array[windowEnd] - array[windowStart - 1]; if (fixedSum > maxSum)
	 * { maxSum = fixedSum; } } return maxSum; }
	 */
	public static int sumOfKnumbersMaxInArray(Integer[] array, int k) {
		int windowStartIndex = 0;
		int windowEndIndex = k - 1;
		int windowSum = Arrays.stream(array, windowStartIndex, windowEndIndex + 1).mapToInt(Integer::intValue).sum();
		windowEndIndex++;
		int maxSum = Integer.MIN_VALUE;
		for (; windowEndIndex < array.length; windowStartIndex++, windowEndIndex++) {
			windowSum = windowSum + array[windowEndIndex] - array[windowStartIndex];
			maxSum = Math.max(windowSum, maxSum);
		}
		return maxSum;
	}

	public static Integer[] reverseElementsInAnArray(Integer[] array) {
		if (array.length != 0) {
			for (int index = 0, jIndex = array.length - 1; index <= jIndex; index++, jIndex--) {
				int temp = 0;
				temp = array[index];
				array[index] = array[jIndex];
				array[jIndex] = temp;
			}
			return array;
		} else {
			return array;
		}
	}

	public static void closestPairInMultipleArray(Integer[] array1, Integer[] array2, int value) {
		int minValue = Integer.MAX_VALUE;
		int minI = Integer.MAX_VALUE;
		int minJ = Integer.MAX_VALUE;
		boolean crossedValue = false;
		for (int index = 0; index < array1.length; index++) {
			for (int jIndex = 0; jIndex < array2.length; jIndex++) {
				int sum = array1[index] + array2[jIndex];
				if ((value - sum) < minValue && minValue > 0) {
					minValue = value - sum;
					minJ = array2[jIndex];
					minI = array1[index];
					System.out.println("Sum: " + sum + " Min Value: " + minValue + "MinI: " + minI + "minJ: " + minJ);
				} else if (sum > value) {
					crossedValue = true;
					break;
				}
			}
			if (crossedValue) {
				break;
			}
		}
	}

	public static int[] replaceElementsMaxValue(int[] arr) {
		for (int index = 0; index < arr.length - 1; index++) {
			int MAXVALUE = Integer.MIN_VALUE;
			for (int jIndex = arr.length - 1; jIndex >= index + 1; jIndex--) {
				MAXVALUE = Math.max(arr[jIndex], MAXVALUE);
			}
			arr[index] = MAXVALUE;
		}
		arr[arr.length - 1] = -1;
		return arr;
	}

	public static void moveZeroes(int[] nums) {
		for (int zeroIndex = 0; zeroIndex < nums.length; zeroIndex++) {
			if (nums[zeroIndex] == 0) {
				for (int numberIndex = zeroIndex + 1; numberIndex < nums.length; numberIndex++) {
					if (nums[numberIndex] != 0) {
						nums[zeroIndex] = nums[numberIndex];
						nums[numberIndex] = 0;
						zeroIndex++;
					}
				}
			}

		}

		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void moveZeroes2(int[] nums) {
		int numberIndex = 0;
		for (int zeroIndex = 0; zeroIndex < nums.length; zeroIndex++) {
			if (nums[zeroIndex] == 0) {
				for (; numberIndex < nums.length; numberIndex++) {
					if (nums[numberIndex] != 0) {
						nums[zeroIndex] = nums[numberIndex];
						nums[numberIndex] = 0;
						break;
					}
				}
			} else {
				numberIndex++;
			}
		}
		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static int[] sortArrayByParity(int[] A) {
		int startIndex = 0, endIndex = A.length - 1;
		int[] res = new int[A.length];
		for (int index = 0; index < A.length; index++) {
			if (A[index] % 2 == 0) {
				res[startIndex++] = A[index];
			} else {
				res[endIndex--] = A[index];
			}
		}
		for (int i : res) {
			System.out.print(i);	
		}
		System.out.println();
		return res;
	}
}
