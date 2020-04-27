package poo.introducao.classes;

public class Main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "zé";
		p1.idade = 20;
		p1.telefone = "99999 9999";
		p1.cpf = "123.123.777-56";
		
		p2.nome = "Maria";
		p2.idade = 17;
		p2.telefone = "96666 6666";
		p2.cpf = "123.123.123-66";
		p2.fazAniversario();
				
		System.out.println(p1.nome + " tem " + p1.idade + " anos");
		System.out.println(p2.nome + " tem " + p2.idade + " anos");
		
		
	}
}
