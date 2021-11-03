
public class VineePrograms {
	public static void Negative(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (j != i) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	public static int[] positiveNegative(int[] arr) {
		int negativeCounter = 0, positiveCounter = 0, oddCounter = 0, evenCounter = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				negativeCounter++;
			} else {
				positiveCounter++;
			}
			if (arr[index] % 2 == 0) {
				evenCounter++;
			} else {
				oddCounter++;
			}
		}
		int[] res = new int[4];
		res[0] = negativeCounter;
		res[1] = positiveCounter;
		res[2] = evenCounter;
		res[3] = oddCounter;
		return res;
	}

	public static int[] swapPositivesRight(int[] arr) {
		for (int index = 0; index < arr.length / 2; index++) {
			if (arr[index] >= 0) {
				for (int jIndex = arr.length - 1; jIndex > 0; jIndex--) {
					
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 20, 31, 42, 53, -60, -75, -81, 90, -103, 25, 26, 78, 56, -32, -65 };

		System.out.println("Array after shifiting negative values to left");
		Negative(arr);
		int[] res = positiveNegative(arr);
		for (int i : res) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
