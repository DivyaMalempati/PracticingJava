import java.util.HashSet;
import java.util.Set;

class StringProgramsDistinctChar {
	public int countConsistentStrings(String allowed, String[] words) {
		Set<Character> hs = constructAHashSet(allowed);
		int stringCounter = 0;
		for (int index = 0; index < words.length; index++) {
			String currentString = words[index];
			if (compareStrings(currentString, hs)) {
				stringCounter++;
			}
		}
		return stringCounter;
	}

	private Set<Character> constructAHashSet(String allowed) {
		Set<Character> hs = new HashSet<Character>();
		char[] characters = allowed.toCharArray();
		for (char c : characters) {
			hs.add(c);
		}
		return hs;
	}

	private boolean compareStrings(String string, Set<Character> hs) {
		char[] splitString = string.toCharArray();
		for (char c : splitString) {
			if (!hs.contains(c)) {
				return false;
			}
		}
		return true;
	}
}