package poo.sobrecarga.construtor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.print("Digite seu nome: ");
		p.nome = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		p.idade = Integer.parseInt(input.nextLine());
		
		System.out.print("Digite seu peso: ");
		p.peso = Double.parseDouble(input.nextLine());
		
		System.out.print("Digite sua altura: ");
		p.altura = Double.parseDouble(input.nextLine());
		
		
		p.imprimir();
		
	}
}
