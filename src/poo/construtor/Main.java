package poo.construtor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta();
//		peça para o usuario digitar o seu nome e o numero da conta
//		depois imptima estes valores
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		c.correntista = input.nextLine();

		System.out.print("Digite o número da conta: ");
		c.numero = Integer.parseInt(input.nextLine());
		
		System.out.print("Digite o saldo da conta: ");
		c.saldo = Double.parseDouble(input.nextLine());
		
		
		c.imprimir();
		
		System.out.print("Quanto deseja sacar? ");
		c.sacar = Double.parseDouble(input.nextLine());
		c.saque(c.sacar);
		
	}

}
