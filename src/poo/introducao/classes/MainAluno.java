package poo.introducao.classes;

public class MainAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.nome = "José";
		a1.nota1 = 7.5;
		a1.nota2 = 4.5;
		a1.calculaMedia();
		
		System.out.println(a1.nome + " teve " + a1.media + " de média");
	}
}
