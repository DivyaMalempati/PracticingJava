import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StringProgramsVowels {
	private static Set<Character> vowels = new HashSet<Character>();
	static {
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
	}

	public static String swapVowels(String word) {
		char[] wordArray = word.toCharArray();
		int leftIndex = 0;
		int rightIndex = word.length() - 1;
		while (leftIndex <= rightIndex) {
			while (leftIndex < rightIndex && !isVowel(wordArray[leftIndex])) {
				leftIndex++;
			}
			while (leftIndex < rightIndex && !isVowel(wordArray[rightIndex])) {
				rightIndex--;
			}
			if (leftIndex <= rightIndex) {
				swapLetters(wordArray, leftIndex, rightIndex);
			}
			leftIndex++;
			rightIndex--;
		}
		return new String(wordArray);
	}

	private static void swapLetters(char[] wordArray, int leftIndex, int rightIndex) {
		char temp = wordArray[leftIndex];
		wordArray[leftIndex] = wordArray[rightIndex];
		wordArray[rightIndex] = temp;
	}

	private static boolean isVowel(char c) {
		return vowels.contains(c);
	}

	@Test
	public void swapVowelsTest() {
		assertEquals("", swapVowels(""));
		assertEquals("p", swapVowels("p"));
		assertEquals("o", swapVowels("o"));
		assertEquals("HoLLE", swapVowels("HELLo"));
		assertEquals("Leotcede", swapVowels("Leetcode"));
		assertEquals("aeiou", swapVowels("uoiea"));
	}
}
