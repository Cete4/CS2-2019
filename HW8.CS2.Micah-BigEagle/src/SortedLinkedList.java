
public class SortedLinkedList {

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

		// TODO JAVADOC
		Node iterator = head.getNext();
		
		// TODO Explain this 
		while (iterator.getNext() != null) {
			iterator = iterator.getNext();
		}
		Node last = new Node(str, null);
		iterator.setNext(last);
		sortList(this);
		this.size++;
	}

	// TODO JAVADOC
	public void deleteItem(String str) throws Exception {
		
		Node iterator = head.getNext();
		this.size--;
	}

	public SortedLinkedList sortList(SortedLinkedList unsortedlist) {

		Node iterator = head.getNext();

		while (iterator.getData() != null) {

			if (iterator.getData().compareTo(iterator.getNext().getData()) < 0) {

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
		return unsortedlist;
	}

	public SortedLinkedList() {
		this.size = 0;
		this.head = new Node("", null);
	}

	@Override
	public String toString() {
		Node iterator = head.getNext();
		sortList(this);
		String list = "";
		while (iterator.getNext() != null) {
			list += iterator.getData();
			list += "\n";
			iterator = iterator.getNext();
		}
		return list;
	}

}
