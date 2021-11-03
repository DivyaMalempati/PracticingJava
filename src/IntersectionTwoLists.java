
public class IntersectionTwoLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode currA = headA, currB = headB;
			while (currA != null && currB != null) {
				if (currA.next == null) {
					return null;
				}
				if (currB.next == null) {
					return null;
				}
				if (currA.val == currB.val) {
					return currA;
				}
				currA = currA.next;
				currB = currB.next;
			}
			return null;
		}
	}
}
