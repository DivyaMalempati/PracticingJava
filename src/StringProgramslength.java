
public class StringProgramslength {
	public static int lengthOfLastWord(String s) {
		String[] splitString = s.split(" ");
		String lastWord = splitString[splitString.length - 1];
		return lastWord.length();
	}

	public static void main(String[] args) {
		int lastWordLength = lengthOfLastWord("Hello World");
		System.out.println(lastWordLength);
		lastWordLength = lengthOfLastWord("");
		System.out.println(lastWordLength);
	}
}
