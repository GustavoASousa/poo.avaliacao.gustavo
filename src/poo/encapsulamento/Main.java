package poo.encapsulamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.print("Digite o nome: ");
		p.setNome(input.nextLine());

		System.out.print("Digite a idade: ");
		p.setIdade(Integer.parseInt(input.nextLine()));;
		
//		imprimir os dados
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		

	}

}
