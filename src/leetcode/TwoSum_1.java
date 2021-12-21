package leetcode;

import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, List<Integer>> valueToIndexListMap = new HashMap<Integer, List<Integer>>();
		for (int index = 0; index < nums.length; index++) {
			List<Integer> indexList = valueToIndexListMap.getOrDefault(nums[index], new ArrayList<Integer>());
			indexList.add(index);
			valueToIndexListMap.put(nums[index], indexList);
		}
		for (int index = 0; index < nums.length - 1; index++) {
			int currentIndex = index;
			int currentValue = nums[index];
			int targetIndex;
			int targetValue = target - nums[index];
			if (valueToIndexListMap.containsKey(targetValue)) {
				List<Integer> listOfIndexes = valueToIndexListMap.get(targetValue);
				if (listOfIndexes.get(0) != currentIndex) {
					targetIndex = listOfIndexes.get(0);
				} else if (listOfIndexes.size() == 1) {
					continue;
				} else {
					targetIndex = listOfIndexes.get(1);
				}
				int[] result = new int[2];
				result[0] = currentIndex;
				result[1] = targetIndex;
				return result;
			}
		}
		return null;
	}

	@Test
	public void twoSumTest() {
		assertArrayEquals(new int[] { 1, 2 }, twoSum(new int[] { 1, 2, 3, 5 }, 5));
		assertArrayEquals(new int[] { 0, 1 }, twoSum(new int[] { 1, 2, 3, 5 }, 3));
	}

}
/*
 * [1,2,3,5] 5 1+2 1+3 1+5 2+3 == 5 True [1,2] 2+5 3+5 Sum of First N numbers
 * n*(n+1)/2 Our Approach n*(n-1)/2 Time Complexity O(n^2)
 * 
 * Map<Integer,List<Integer>> Key = Array Value Value = Array Indexes
 *
 * target-2{index}= hs.contains()
 * 
 */
