import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringProgramsEqual {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String firstWord = buildAString(word1);
		String secondWord = buildAString(word2);
		return firstWord.equals(secondWord);
	}

	private String buildAString(String[] word1) {
		if (word1.length == 0) {
			return "";
		}
		StringBuilder wordBuilder = new StringBuilder();
		for (String string : word1) {
			wordBuilder.append(string);
		}
		return wordBuilder.toString();

	}

	@Test
	public void arrayStringsAreEqualTest() {
		assertTrue(arrayStringsAreEqual(new String[] { "a", "bc" }, new String[] { "abc" }));
		assertTrue(arrayStringsAreEqual(new String[] { "ab", "bc" }, new String[] { "a", "b", "bc" }));
		assertFalse(arrayStringsAreEqual(new String[] { "ab", "bc" }, new String[] { "abc" }));
		assertTrue(arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "abc" }));
	}
}
