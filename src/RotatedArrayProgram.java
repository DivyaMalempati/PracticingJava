public class RotatedArrayProgram {
	public static int rotatedArrayLowestValueIndex(Integer[] rotatedArray) {
		int startIndex = 0, endIndex = rotatedArray.length - 1;
		Integer resultValue = rotatedArray[startIndex];
		if (rotatedArray[startIndex] < rotatedArray[endIndex]) {
			//System.out.println(rotatedArray[startIndex]);
			return rotatedArray[startIndex];
		} else {
			while (startIndex <= endIndex) {
				int midIndex = (startIndex + endIndex) / 2;
				if (rotatedArray[startIndex] < rotatedArray[midIndex]) {
					if (rotatedArray[midIndex + 1] > rotatedArray[midIndex]) {
						return rotatedArray[midIndex];
					} else {
						startIndex = midIndex + 1;
					}
				} else if (rotatedArray[startIndex] > rotatedArray[midIndex]) {
					if (rotatedArray[midIndex - 1] > rotatedArray[midIndex]) {
						return rotatedArray[midIndex];
					} else {
						endIndex = midIndex - 1;
					}
				} else {
					resultValue = rotatedArray[midIndex];
				}
			}
			return resultValue;
		}
	}

	public static int inRotatedArrayFindMinIndex(Integer[] rotatedArray) {
		int startIndex = 0, endIndex = rotatedArray.length - 1;
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			int startValue = rotatedArray[startIndex], midValue = rotatedArray[midIndex],
					endValue = rotatedArray[endIndex];
			if (startValue <= endValue) {
				return startIndex;
			} else {
				if (startValue <= midValue) {
					startIndex = midIndex + 1;
				} else {
					endIndex = midIndex;
				}
			}
		}
		return startIndex;
	}

	public static boolean findElementInRotatedArray(Integer[] rotatedArray, int searchElement) {
		int smallestValueIndex = inRotatedArrayFindMinIndex(rotatedArray);
		int endIndex = rotatedArray.length - 1;
		boolean firstHalf = binarySearchbetweenTwoIndex(rotatedArray, 0, smallestValueIndex, searchElement);
		boolean secondHalf = binarySearchbetweenTwoIndex(rotatedArray, smallestValueIndex + 1, endIndex, searchElement);
		if (firstHalf || secondHalf)
			return true;
		else
			return false;
	}

	public static boolean binarySearchbetweenTwoIndex(Integer[] rotatedArray, int startIndex, int endIndex,
			int searchElement) {
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if (searchElement == rotatedArray[midIndex]) {
				return true;
			} else if (searchElement <= rotatedArray[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}
		}
		return false;
	}
}