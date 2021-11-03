
public class StringPrograms {
	public static boolean checkIfStringIsPalindrome(String args) {

		String output = reverseString(args);
		if (args.equals(output)) {
			return true;
		}
		return false;
	}

	private static String reverseString(String args) {
		if (args == null || args.isEmpty()) {
			return args;
		}
		return args.charAt(args.length() - 1) + reverseString(args.substring(0, args.length() - 1));
	}

	public static void main(String[] args) {
		if (checkIfStringIsPalindrome("bob")) {
			System.out.println("palindrome");
		}
	}
}
