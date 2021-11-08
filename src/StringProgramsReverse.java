import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StringProgramsReverse {
	public static String stringsReverse(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder toSentence = new StringBuilder();
		for (int index = 0; index < words.length; index++) {
			if (index % 2 == 1) {
				words[index] = reverseWords(words[index]);
			}
			toSentence.append(words[index] + " ");
		}
		System.out.println(toSentence.toString().trim());
		return toSentence.toString().trim();
	}

	private static String reverseWords(String string) {
		StringBuilder reverseWord = new StringBuilder();
		reverseWord.append(string);
		return reverseWord.reverse().toString();
	}

	@Test
	public void stringsReverseTest() {
		assertEquals("Trying ot Reverse a Sentence.", stringsReverse("Trying to Reverse a Sentence."));
		assertEquals("to esreveR a .ecnetneS", stringsReverse("to Reverse a Sentence."));
	}
}
