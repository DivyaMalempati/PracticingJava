class MyLinkedList {

	int length;
	Node head;

	class Node {
		int val;
		Node next;

		Node(int x) {
			this.val = x;
		}
	}

	/** Initialize your data structure here. */
	public MyLinkedList() {
		this.length = 0;
		this.head = null;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		if (index < 0 || index >= length) {
			return -1;
		} else {
			int counter = 0;
			Node cur = head;
			while (counter != index) {
				cur = cur.next;
				counter++;
			}
			return cur.val;
		}
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node newNode = new Node(val);
		newNode.next = this.head;
		this.head = newNode;
		length++;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (this.length == 0) {
			addAtHead(val);
		}else {
			Node newNode = new Node(val);
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
			newNode.next = null;
			this.length++;
		}	
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		Node cur = head;
		Node newNode = new Node(val);
		if (index == 0) {
			addAtHead(val);
			return;
		}
		if (index == this.length) {
			addAtTail(val);
			return;

		}
		if (index >= length) {
			return;
		}
		int counter = 0;
		while (counter != index - 1) {
			cur = cur.next;
			counter++;
		}
		newNode.next = cur.next;
		cur.next = newNode;
		length++;
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index < 0 || index >= this.length) {
			return;
		}
		Node curr = head;
		if (index == 0) {
			head = curr.next;
			length--;
		} else {
			Node cur = head;
			Node pre = null;
			int counter = 0;
			while (counter != index) {
				pre = cur;
				cur = cur.next;
				counter++;
			}
			pre.next = cur.next;
			length--;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Size = " + length + "\nElements = [");
		Node cur = head;
		int index = 0;
		while (cur != null) {
			sb.append(index++ + " : " + cur.val + ", ");
			cur = cur.next;
		}
		sb.append("]");
		return sb.toString();
	}

	public int getSize() {
		return length;
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */