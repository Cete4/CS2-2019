

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void test() {
		int x = 3;
		assertTrue(3 == x);
		LinkedList ll = new LinkedList();
		try
		{
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
		System.out.println(ll);
		ll.deleteItem("A");
		assertTrue(ll.getHead().getNext().getData().equals("C"));
		ll.deleteItem("G");
		assertTrue(ll.getHead().getNext().getData().equals("C"));
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String [] args)
	{
		TestLinkedList t = new TestLinkedList();
		t.test();
	}

}
