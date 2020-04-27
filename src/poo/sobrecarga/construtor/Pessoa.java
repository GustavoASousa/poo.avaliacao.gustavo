package poo.sobrecarga.construtor;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	double altura;
	double imc;
	
	public Pessoa() {
		System.out.println("Olá pessoa");
	}

	public Pessoa(String nome) {
		System.out.println("ola nome");
		
	}

	public Pessoa(String nome, int idade) {
		System.out.println();
	}

	public Pessoa(double peso, double altura) {
		System.out.println();
	}

	public Pessoa(String nome, int idade, double peso, double altura) {
		System.out.println();
	}
	
	void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Resultado: " + verificaPeso());
	}
	
	double calcularIMC() {
		double imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		return imc;
	}

	String verificaPeso() {
		double resultadoIMC = calcularIMC();
		String resposta = "";
		if (resultadoIMC < 18) {
			resposta = "Magrelo";
		} else if (resultadoIMC >= 18 && resultadoIMC < 21) {
			resposta = "Magro";
		}else if (resultadoIMC >= 21 && resultadoIMC < 24) {
			resposta = "Normal";
		} else if (resultadoIMC >= 24 && resultadoIMC < 28) {
			resposta = "Gordinho";
		}else if (resultadoIMC >= 28) {
			resposta = "Gordo";
		}
		return resposta;
		
	}

}
