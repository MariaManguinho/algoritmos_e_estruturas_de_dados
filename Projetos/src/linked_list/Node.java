package linked_list;

public class Node<TYPE> {
	
	private TYPE value;
	private Node<TYPE> next;
	
	public Node(TYPE newValue) {
		this.value = newValue;
	}
	
	public TYPE getValue() {
		return value;
	}
	public void setValue(TYPE value) {
		this.value = value;
	}
	public Node<TYPE> getNext() {
		return next;
	}
	public void setNext(Node<TYPE> next) {
		this.next = next;
	}
	
}
