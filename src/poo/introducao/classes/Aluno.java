package poo.introducao.classes;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	double media;
	
	void calculaMedia() {
		media = (nota1 + nota2) / 2;
	}
}
