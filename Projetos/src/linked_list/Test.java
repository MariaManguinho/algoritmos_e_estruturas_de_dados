package linked_list;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("AC");
		lista.add("BA");
		lista.add("PE");
		System.out.println("Tamanho: " + lista.getSize());
		System.out.println("Primeiro elemento na lista: " + lista.getFirst().getValue());
		System.out.println("Último elemento na lista: " + lista.getLast().getValue());
		
		for(int i = 0; i < lista.getSize(); i++) {
			System.out.println(lista.get(i).getValue());
		}
		
		lista.remove("PE");
		lista.add("PB");
		
		
		for(int i = 0; i < lista.getSize(); i++) {
			System.out.println(lista.get(i).getValue());
		}
		
		System.out.println("Removendo todos os valores:");
		lista.remove("PB");
		lista.remove("BA");
		lista.remove("AC");
		System.out.println("Tamanho: " + lista.getSize());
		
	}
}
