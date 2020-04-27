package poo.associacao2;

public class Pessoa {
	private String nome;
	private int idade;
	private Cidade cidade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	
	public void setIdade(int idade) {
		if (idade < 0 || idade > 150) {
			System.out.println("Idade inválida");
		} else {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return idade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void imprimePessoa() {
		System.out.println(nome + " " + idade); 
	}
	
	public void imprimeCidade() {
		cidade.imprimeCidade();
	}

}
