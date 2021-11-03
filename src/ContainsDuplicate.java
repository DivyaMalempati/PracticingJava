import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] array) {
		Set<Integer> hs = new HashSet<Integer>();
		for (int index = 0; index < array.length; index++) {
			if (hs.contains(array[index])) {
				return true;
			}
			hs.add(array[index]);
		}
		return false;
	}
}
