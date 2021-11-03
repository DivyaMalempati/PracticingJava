
public class ElementSearchUsingBinarySearch {
	public static boolean binarySearchOnELement(Integer[] searchArray, int searchElement) {
		int startIndex = 0, endIndex = searchArray.length - 1;
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if (searchArray[midIndex] == searchElement) {
				return true;
			} else if (searchElement < searchArray[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}
		}
		return false;
	}
}
