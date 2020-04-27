package poo.modificadores.acesso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual seu nome: ");
		String nomeDigitado = input.nextLine();
		
		Pessoa p = new Pessoa(nomeDigitado);
		
		p.fazAniverssario();
		p.alteraSalario(1000);
		p.aumentaSalario(10);
		p.imprimir();
		
		

	}

}
