
public class Node {

	/**
	 * This should be a string that the user wants to be the data contained by the
	 * node
	 */
	private String data;

	/**
	 * This is a pointer that can either point to null or the next node in the
	 * linked list
	 */
	private Node next;

	/**
	 * Method that returns the data of a particaular node
	 * 
	 * @return A string that is the data that a particular node holds
	 */
	public String getData() {
		return data;
	}

	/**
	 * Method that sets the data of a node to a new String
	 * 
	 * @param data A word or phrase that the user wants to be held by the nodes
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Method that returns the next node in the linked list or null if the current
	 * node is the last node in the linked list
	 * 
	 * @return The next node in the linked list or null if there are no more nodes
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Method that creates a pointer in the current node to the next node in the
	 * linked list
	 * 
	 * @param next The next node in the linked list
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data.toString();
	}

	/**
	 * Constructor for creating a new node
	 * 
	 * @param data A string that the user wants to be the data that is held by this
	 *             node
	 * @param next The node that is after this node, this can be null if there is no
	 *             other node after the one being created
	 */
	public Node(String data, Node next) {
		setData(data);
		setNext(next);
	}

}
