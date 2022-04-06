package linked_list;

public class TestCachorro {

	public static void main(String[] args) {
		LinkedList<Cachorro> doguinho = new LinkedList<Cachorro>();
		
		doguinho.add(new Cachorro("Fergos", 2));
		doguinho.add(new Cachorro("Iara", 3));
		doguinho.add(new Cachorro("Juba", 5));
		doguinho.add(new Cachorro("Bolinha", 9));
		
		for(int i = 0; i < doguinho.getSize(); i++) {
			System.out.println((i+1) + "º Cachorro: " + doguinho.get(i).getValue());
		}
		
		doguinho.remove(doguinho.get(1).getValue());
		
		for(int i = 0; i < doguinho.getSize(); i++) {
			System.out.println((i+1) + "º Cachorro: " + doguinho.get(i).getValue());
		}
	}
}
