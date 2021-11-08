
public class StringProgramsOperations {
	public static int finalValueAfterOperations(String[] operations) {
		int X = 0;
		for (int index = 0; index < operations.length; index++) {
			if (operations[index] == "X++" || operations[index] == "++X") {
				X++;
			} else {
				X--;
			}
			// System.out.println(index+" "+X);
		}
		return X;

	}

	public static void main(String[] args) {
		int value = 0;
		value = finalValueAfterOperations(new String[] { "--X", "X++", "X++" });
		System.out.println("FInal Value " + value);
		value = finalValueAfterOperations(new String[] { "X++", "++X", "--X", "X--" });
		System.out.println("FInal Value " + value);
		value = finalValueAfterOperations(new String[] { "X++", "++X", "++X" });
		System.out.println("FInal Value " + value);

	}
}
