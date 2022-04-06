package linked_list;

public class TestInteger {

	public static void main(String[] args) {
		LinkedList<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(int i = 0; i < numeros.getSize(); i++) {
			System.out.println(numeros.get(i).getValue());
		}

	}

}
