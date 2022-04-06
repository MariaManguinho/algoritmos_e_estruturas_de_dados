package linked_list;

public class LinkedList<TYPE> {
	
	private Node<TYPE> first;
	private Node<TYPE> last;
	private int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	public Node<TYPE> getFirst() {
		return first;
	}
	public void setFirst(Node<TYPE> first) {
		this.first = first;
	}
	public Node<TYPE> getLast() {
		return last;
	}
	public void setLast(Node<TYPE> last) {
		this.last = last;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void add(TYPE newValue) {
		
		Node<TYPE> newNode = new Node<TYPE>(newValue);
		if(this.first == null && this.last == null) {
			this.first = newNode;
			this.last = newNode;
		}else{
			this.last.setNext(newNode);
			this.last = newNode;
		}
		this.size++;
	}
	
	public void remove(TYPE value) {
		Node<TYPE> previousNode = null;
		Node<TYPE> currentNode = this.first;
		for(int i = 0; i < this.getSize(); i++) {
			if(currentNode.getValue().equals(value)) {
				if(this.size == 1) {
					this.first = null;
					this.last = null;
				}else if(currentNode == this.first) {
					this.first = currentNode.getNext();
					currentNode.setNext(null);
				}else if(currentNode == this.last){
					this.last = previousNode;
					previousNode.setNext(null);
				}else {
					previousNode.setNext(currentNode.getNext());
					currentNode = null;
				}
				this.size--;
				break;
			}else {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
		}
			
	}
	
	public Node<TYPE> get(int position) {
		Node<TYPE> currentNode = this.first;
		for(int i = 0; i < position; i++) {
			if(currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
		}
		return currentNode;
	}

}
