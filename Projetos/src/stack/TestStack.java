package stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>(); 
		
		for(int i = 0; i <= 10; i++) {
			stack.push(i);
		}
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());

	}

}
