import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
	public static void mergingTwoArrays(int[] array1, int[] array2) {
		int a1Length = array1.length;
		int counter = 0;
		int a2Length = array2.length;
		int[] outputArray = new int[a1Length + a2Length];
		// mergeArrays(array1, array2, a1Length, a2Length, outputArray);
		for (int index = 0; index < array1.length; index++) {
			outputArray[counter++] = array1[index];
		}
		for (int index = 0; index < array2.length; index++) {
			outputArray[counter++] = array2[index];
		}
		Arrays.sort(outputArray);
		for (int i : outputArray) {
			System.out.println(i);
		}
	}

	// Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode detectCycle(ListNode head) {
			ListNode curr = head;
			List<ListNode> storeNode = new ArrayList<ListNode>();
			while (curr != null) {
				if (curr.next == null) {
					return null;
				}
				if (storeNode.contains(curr.next)) {
					return curr.next;
				}
				storeNode.add(curr);
				curr = curr.next;
			}
			return curr;

		}
	}

	public static void main(String[] args) {
		mergingTwoArrays(new int[] { 1, 3, 4, 5 }, new int[] { 2, 4, 6, 8 });
	}
}
