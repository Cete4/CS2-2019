
public class LinkedList {

	/**
	 * The size of the linked list
	 */
	private int size;

	/**
	 * The sentinal node of the linked list
	 */
	private Node head;

	/**
	 * Method that gets the current size of the linked list
	 * 
	 * @return int size of the linked list
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Method that sets the size of the lnked list this method is never used
	 * intentionally
	 * 
	 * @param size The instance variable that is the size of the linked list
	 */
	private void setSize(int size) {
		this.size = size;
	}

	/**
	 * Method that returns the sentinal node of the linked list
	 * 
	 * @return The instance variable that points to the head node of the linked list
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * Method that sets the head as a node this method is never used
	 * 
	 * @param head A node that should be used as the sentinal node of the linked
	 *             list
	 */
	private void setHead(Node head) {
		this.head = head;
	}

	/**
	 * Method that adds an item to the linked list
	 * 
	 * @param str A word of phrase that gets added to the linked list
	 * @throws Exception throws an exception if the user enters a string that is
	 *                   already held in the linked list
	 */
	public void addItem(String str) throws Exception {

		/*
		 * If head has no next value then this is the first node to be added to the
		 * linked list and so head should point to it
		 */
		if (head.getNext() == null) {
			Node first = new Node(str, null);
			head.setNext(first);
			this.size++;
		} else {
			Node iterator = head.getNext();
			/*
			 * If the node is not the forst item to be added to the list then just add it to
			 * the end and sort the list so its in order
			 */
			while (iterator.getNext() != null) {
				if (iterator.getData().equals(str)) {
					throw new Exception("Error adding String: Duplicate String in List");
				} else {
					iterator = iterator.getNext();
				}
			}
			/*
			 * Adding the node to the end of the array list as the last node
			 */
			if (iterator.getData().equals(str)) {
				throw new Exception("Error adding String: Duplicate String in List");
			} else {
				Node last = new Node(str, null);
				iterator.setNext(last);
				sortList(this);
				this.size++;
			}
		}
	}

	/**
	 * Method that deletes a node that contains the provided string if there is no
	 * node associated with that particular string then an error will be thrown
	 * 
	 * @param str The string that the user is trying to delete from the linked list
	 * @throws Exception If there is no string with the same value as the the one
	 *                   provided by the user an exception will then be thrown
	 */
	public void deleteItem(String str) throws Exception {

		Node iterator = head.getNext();
		boolean grac = false;
		if (head.getNext() == null) {
			// Do Nothing
		} else {
			while (iterator.getNext().getNext() != null) {
				if (iterator.getNext().getData().equals(str)) {
					iterator.setNext(iterator.getNext().getNext());
					grac = true;
					this.size--;
				}
				iterator = iterator.getNext();
			}

			// Checks the 0th case
			if (head.getNext().getData().equals(str)) {
				head.setNext(head.getNext().getNext());
				this.size--;
			} else if (iterator.getNext().getData().equals(str)) // Checks the last case of the list
			{
				iterator.setNext(null);
				this.size--;
			} else if (grac == false) {

				throw new Exception("Error deleting string: This string isn't in the linked list.");
			}
		}

	}

	/**
	 * Sorts an unsorted linked list by the value of the strings. There is no return
	 * because the new list will be in sorted order
	 * 
	 * @param unsortedlist The list that needs to be sorted
	 */
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

	/**
	 * Constuctor for the linked list all default values are accounted for so the
	 * user doesn't need to provide any
	 */
	public LinkedList() {
		this.size = 0;
		this.head = new Node("", null);
	}

	/**
	 * A toStrting that will print things in the order specified by instructions
	 */
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
