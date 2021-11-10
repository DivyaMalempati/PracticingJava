import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StringProgramRotateStrings {
	public static boolean rotateString(String s, String goal) {
		Set<String> hashRotations = possibleRotations(s);
		return hashRotations.contains(goal);
	}

	private static Set<String> possibleRotations(String s) {
		Set<String> hashRotations = new HashSet<String>();
		String tempstring = s.substring(0, s.length());
		hashRotations.add(tempstring);
		for (int index = 1; index < s.length(); index++) {
			StringBuilder buildAString = new StringBuilder();
			String tempAppend = " ";
			if (index >= 1) {
				tempAppend = s.substring(0, index);
			}
			tempstring = s.substring(index, s.length());
			buildAString.append(tempstring + tempAppend);
			hashRotations.add(buildAString.toString());
		}
		return hashRotations;
	}

	@Test
	public void rotateStringTest() {
		assertTrue(rotateString(new String("abcde"), new String("bcdea")));
		assertFalse(rotateString(new String("abcde"), new String("bcead")));
	}

}
