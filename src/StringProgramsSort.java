import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringProgramsSort {
	public String sortSentence(String s) {
		String[] words = s.split(" ");
		String[] stringArray = new String[words.length];
		stringArray = sortWordsRearrange(words, stringArray);
		s = buildAString(stringArray);
		return s;
	}

	private String buildAString(String[] stringArray) {
		StringBuilder sb = new StringBuilder();
		for (String string : stringArray) {
			sb.append(string + " ");
		}
		return sb.toString().trim();
	}

	public String[] sortWordsRearrange(String[] words, String[] stringArray) {
		for (int index = 0; index < words.length; index++) {
			char[] split = words[index].toCharArray();
			int stringArrayIndex = Character.getNumericValue(split[split.length - 1]);
			stringArray[stringArrayIndex - 1] = words[index].substring(0, words[index].length() - 1);
		}
		return stringArray;
	}

	@Test
	public void sortWordsRearrangeTest() {
		assertArrayEquals(new String[] { "This", "is", "a", "sentence" }, sortWordsRearrange(
				new String[] { "is2", "This1", "sentence4", "a3" }, new String[] { " ", " ", " ", " " }));
		assertArrayEquals(new String[] { "Hi" }, sortWordsRearrange(new String[] { "Hi1" }, new String[] { " " }));

	}

	@Test
	public void sortSentenceTest() {
		assertEquals(new String("Me Myself and I"), sortSentence(new String("Myself2 Me1 I4 and3")));
		assertEquals(new String("Me Myself"), sortSentence(new String("Myself2 Me1")));
	}
}
