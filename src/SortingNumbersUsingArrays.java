import java.util.Scanner;

public class SortingNumbersUsingArrays {
	public static void main(String[] args) {
		Integer[] arrayToBeSorted = new Integer[10];
		toInsertElements(arrayToBeSorted);
		printArray(arrayToBeSorted);
		Integer[] sortedArray = toSort(arrayToBeSorted);
		printArray(sortedArray);
	}

	private static void toInsertElements(Integer[] arrayToBeSorted) {
		Scanner in = new Scanner(System.in);
		for (int index = 0; index < arrayToBeSorted.length; index++) {
			arrayToBeSorted[index] = in.nextInt();
		}
		in.close();
	}

	private static void printArray(Integer[] arrayToBePrinted) {
		for(Integer s: arrayToBePrinted ) {
			System.out.println(s);
		}
	}

	private static Integer[] toSort(Integer[] sortedArray) {
		
		return sortedArray;
	}
}
