
public class LinkedList {

	// TODO JAVADOC
	private int size;

	// TODO JAVADOC
	private Node head;

	// TODO JAVADOC
	public int getSize() {
		return size;
	}

	// TODO JAVADOC
	private void setSize(int size) {
		this.size = size;
	}

	// TODO JAVADOC
	public Node getHead() {
		return head;
	}

	// TODO JAVADOC
	private void setHead(Node head) {
		this.head = head;
	}

	// TODO JAVADOC
	public void addItem(String str) throws Exception {

		// TODO Explain this
		if (head.getNext() == null) {
			Node first = new Node(str, null);
			head.setNext(first);
			this.size++;
		} else {
			// TODO JAVADOC
			Node iterator = head.getNext();
			// TODO Explain this
			while (iterator.getNext() != null) {
				if (iterator.getData().equals(str)) {
					throw new Exception("Error adding String: Duplicate String in List");
				} else {
					iterator = iterator.getNext();
				}
			}
			// TODO Explain this
			Node last = new Node(str, null);
			iterator.setNext(last);
			sortList(this);
			this.size++;
		}
	}

	// TODO JAVADOC
	public void deleteItem(String str) throws Exception {

		Node iterator = head.getNext();
		boolean grac = false;
		while (iterator.getNext().getNext() != null) {
			if (iterator.getNext().getData().equals(str)) {
				iterator.setNext(iterator.getNext().getNext());
				grac = true;
				this.size--;
			}
			iterator = iterator.getNext();
		}

		if (head.getNext().getData().equals(str)) {
			head.setNext(head.getNext().getNext());
			this.size--;
		} else if (iterator.getNext().getData().equals(str)) {
			iterator.setNext(null);
			this.size--;
		} else if (grac == false) {
			throw new Exception("Error deleting string: This string isn't in the linked list.");
		}
	}

	public void sortList(LinkedList unsortedlist) {

		Node iterator = head.getNext();

		while (iterator != null && iterator.getNext() != null) {

			if (iterator.getData().compareTo(iterator.getNext().getData()) > 0) {

				/*
				 * If the string after the iterator is smaller than the iterator then create a
				 * dummy node to temporarily hold value
				 * 
				 * Then switch the node after the iterator to equal the values of the iterator
				 * 
				 * Last set the iterator to the the temporarily held values from the dummy which
				 * was the node after the iterator but will now be the iterator
				 * 
				 * Last set the iterator back to the head to resort the list after the change
				 * 
				 */
				Node dummy = new Node(iterator.getNext().getData(), iterator.getNext().getNext());

				iterator.getNext().setData(iterator.getData());

				iterator.setData(dummy.getData());

				// After the adjustment loop the sort from the begining
				iterator = head.getNext();

			} else {
				iterator = iterator.getNext();
			}

		}
	}

	// TODO JAVADOC
	public LinkedList() {
		this.size = 0;
		this.head = new Node("", null);
	}

	@Override
	public String toString() {
		String list = "";
		if (head.getNext() != null) {
			Node iterator = head.getNext();
			int i = -1;
			while (iterator.getNext() != null) {
				i++;
				list += i + ":     ";
				list += iterator.getData();
				list += "\n";
				iterator = iterator.getNext();
			}

			// TODO Try to fix this to make it neater
			i++;
			list += i + ":     ";
			list += iterator.getData();
		}
		return list;
	}

}
