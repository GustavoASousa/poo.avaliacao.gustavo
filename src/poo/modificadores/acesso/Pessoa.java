package poo.modificadores.acesso;

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	
	public Pessoa(String novoNome) {
		nome = novoNome;
	}
	
	public Pessoa(String novoNome , int novaidade ) {
		nome = novoNome;
		idade = novaidade;
	}
	
	public void alteraidade (int novaidade) {
		if (novaidade < 0 || novaidade > 200) {
			System.out.println("Idade Invalida");
		}
		else {
			idade = novaidade;
		}
	}
	
	public void fazAniverssario() {
		idade++;
	}
	
	public void alteraSalario (double novoSalario) {
		if (novoSalario < 0 || novoSalario > 50000) {
			System.out.println("Salario Invalido");
		}
		else {
			salario = novoSalario;
		}
	}
	
	public void aumentaSalario (double aumento) {
		double proc = aumento/100;
		
		double salfinal = salario + (salario*proc);
		
		salario = salfinal;
	}
	
	public void imprimir () {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
	}
	
}
