import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {
	MyLinkedList list = new MyLinkedList();

	@Test
	void linkedListTest() {
/*		list.addAtHead(10);
		list.addAtHead(5);
		System.out.println(list.toString());
		int indexValue = list.get(0);
		System.out.println("0Th Index Value is " + indexValue);
		list.addAtTail(15);
		System.out.println(list.toString());
		list.deleteAtIndex(2);
		list.addAtHead(50);
		System.out.println(list.toString());
		list.deleteAtIndex(2);
		list.addAtIndex(5, 25);
		list.addAtIndex(2, 25);
		list.deleteAtIndex(0);
		list.addAtTail(100);
		indexValue = list.get(2);
		System.out.println("List Length:" + list.getSize());
		System.out.println("2nd Index Value is " + indexValue);
		System.out.println(list.toString());*/

		MyLinkedList lists = new MyLinkedList();
		lists.addAtTail(1);
		lists.addAtTail(3);
		System.out.println(lists.get(1));
		System.out.println(lists.toString());
	}
}
