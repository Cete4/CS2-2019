
public class Node {

	// TODO JAVADOC
	private String data;

	// TODO JAVADOC
	private Node next;

	// TODO JAVADOC
	public String getData() {
		return data;
	}

	// TODO JAVADOC
	public void setData(String data) {
		this.data = data;
	}

	// TODO JAVADOC
	public Node getNext() {
		return next;
	}

	// TODO JAVADOC
	public void setNext(Node next) {
		this.next = next;
	}

	// TODO JAVADOC
	public Node(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}

	// TODO JAVADOC
	public Node(String data, Node next) {
		setData(data);
		setNext(next);
	}

}
