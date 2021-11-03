import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeAugustProgram {
	public static int[] twoSumInArray(int[] nums, int target) {
		int[] array = new int[2];
		for (int index = 0; index < nums.length - 1; index++) {
			for (int jIndex = index + 1; jIndex < nums.length; jIndex++) {
				if ((target - nums[index]) == nums[jIndex]) {
					array[0] = index;
					array[1] = jIndex;
					return array;
				}
			}
		}
		return array;
	}

	public static int[] twoSumInArrayHashMap(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] array = new int[2];
		for (int index = 0; index < nums.length; index++) {
			if (!hm.containsKey((nums[index]))) {
				hm.put(nums[index], index);
			}
		}
		for (int index = 0; index < nums.length - 1; index++) {
			if (hm.containsKey((nums[index]))) {
				hm.remove(nums[index], index);
			}
			if (hm.containsKey(target - nums[index])) {
				array[0] = index;
				array[1] = hm.get(target - nums[index]);
			}
		}
		return array;
	}

	public static int[] twoSumInArrayHashMapSet(int[] nums, int target) {
		HashMap<Integer, Set<Integer>> hm = new HashMap<Integer, Set<Integer>>();
		int[] array = new int[2];
		for (int index = 0; index < nums.length; index++) {
			int indexValue = nums[index];
			Set<Integer> indexes;
			if (!hm.containsKey(indexValue)) {
				indexes = new HashSet<Integer>();
			} else {
				indexes = hm.get(indexValue);
			}
			indexes.add(index);
			hm.put(indexValue, indexes);
		}
		for (int index = 0; index < nums.length - 1; index++) {
			int indexValue = nums[index];
			if (hm.containsKey(indexValue)) {
				Set<Integer> indexes = hm.get(indexValue);
				indexes.remove(index);
				if (indexes.isEmpty()) {
					hm.remove(indexValue);
				} else {
					hm.put(indexValue, indexes);
				}
			}
			if (hm.containsKey(target - indexValue)) {
				array[0] = index;
				array[1] = hm.get(target - indexValue).iterator().next();
				return array;
			}
		}
		return array;
	}
}