
public class PrimeNumber {
	public static boolean findPrimeOrNot(Integer numberToBeChecked) {
		if (numberToBeChecked == 0 || numberToBeChecked == 1) {
			return false;
		}
		int maxValueToCheck = (int) Math.sqrt(numberToBeChecked);
		for (int valuesToCheck = 2; valuesToCheck <= maxValueToCheck; valuesToCheck++) {
			if (numberToBeChecked % valuesToCheck == 0) {
				return false;
			}
		}
		return true;
	}
	
}
