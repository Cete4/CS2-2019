
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void test() {
		int x = 3;
		assertTrue(3 == x);
		LinkedList ll = new LinkedList();
		try {
			ll.addItem("F");
			assertTrue(ll.getHead().getNext().getData().equals("F"));
			ll.addItem("A");
			assertTrue(ll.getHead().getNext().getData().equals("A"));
			ll.addItem("C");
			assertTrue(ll.getHead().getNext().getData().equals("A"));
			ll.addItem("G");
			assertTrue(ll.getHead().getNext().getData().equals("A"));
			ll.addItem("D");
			assertTrue(ll.getHead().getNext().getData().equals("A"));
			ll.addItem("B");
			ll.addItem("E");
			ll.addItem("H");
			ll.addItem("I");
			ll.addItem("J");

			System.out.println(ll + "\nThe full list" + ll.getSize());
			System.out.println();

			ll.deleteItem("A");
			assertTrue(ll.getHead().getNext().getData().equals("B"));
			System.out.println(ll + " \nThe list without A" + ll.getSize());
			System.out.println();

			ll.deleteItem("D");
			assertTrue(ll.getHead().getNext().getData().equals("B"));
			System.out.println(ll + "\nThe list without D" + ll.getSize());
			System.out.println();

			ll.deleteItem("J");
			assertTrue(ll.getHead().getNext().getData().equals("B"));
			System.out.println(ll + "\nThe list without J " + ll.getSize());
			System.out.println();

			ll.deleteItem("T");
			assertTrue(ll.getHead().getNext().getData().equals("B"));
			System.out.println(ll + "\nTesting the error by checking for T" + ll.getSize());
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		TestLinkedList t = new TestLinkedList();
		t.test();
	}

}
