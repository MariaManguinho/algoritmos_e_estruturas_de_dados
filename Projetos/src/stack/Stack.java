package stack;

public class Stack<TYPE> {
	
	NodeStack<TYPE> top;	
	
	public void push(TYPE data) {
		if(this.top == null) {
			this.top = new NodeStack<TYPE>(data);
		} else {
			NodeStack<TYPE> nextNode = this.top;
			this.top = new NodeStack<TYPE>(data, nextNode);
		}
	}
	
	public TYPE pop(){
		if (this.top == null) {
			throw new RuntimeException("The stack is empty");
		} else {
			NodeStack<TYPE> top = this.top;
			this.top = this.top.getNext();
			return top.getData();
		}
	}
	
	public TYPE peek(){
		if (this.top == null) {
			throw new RuntimeException("The stack is empty");
		} else {
			return this.top.getData();
		}
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}

}
