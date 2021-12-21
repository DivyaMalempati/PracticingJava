
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeetCodeAnagram {
	public boolean isAnagram(String s, String t) {
		int[] charCount = new int[128];
		if (s.length() == t.length()) {
			for (int index = 0; index < s.length(); index++) {
				charCount[s.charAt(index)]++;
				charCount[t.charAt(index)]--;
			}
		} else {
			return false;
		}
		for (int index = 0; index < charCount.length;) {
			while (charCount[index++] != 0) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void anagramTest() {
		assertFalse(isAnagram("anagram", "ntaagram"));
		assertTrue(isAnagram("anagram", "naagram"));
		assertTrue(isAnagram("anagram", "margana"));
		assertFalse(isAnagram("rat", "car"));
	}
}
