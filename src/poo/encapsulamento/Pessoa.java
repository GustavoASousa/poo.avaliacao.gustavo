package poo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	
	public void setIdade (int idade) {
		if (idade < 0) {
			this.idade = 0;
		} else {			
			this.idade = idade;			
		}
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void imprimePessoa() {
		System.out.println(nome + " " + idade); 
	}
}
