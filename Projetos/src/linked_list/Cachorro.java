package linked_list;

public class Cachorro {
	
	private String nome;
	private int idade;
	
	public Cachorro(String novoNome, int novaIdade) {
		this.nome = novoNome;
		this.idade = novaIdade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return this.nome;
	}
}
