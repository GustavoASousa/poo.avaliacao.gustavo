package poo.introducao.estacionamento;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro();
//		Carro c2 = new Carro();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		c1.ano = Integer.parseInt(input.nextLine());
		
		System.out.print("Digite a cor: ");
		c1.cor = input.nextLine();
		
		System.out.print("Digite a marca: ");
		c1.marca = input.nextLine();
		
		System.out.print("Digite o modelo: ");
		c1.modelo = input.nextLine();
		
		System.out.print("Digite a placa: ");
		c1.placa = input.nextLine();
		
		System.out.print("Digite o preço: R$ ");
		c1.preco = Double.parseDouble(input.nextLine());
		
		System.out.print("Digite quanto é a entrada: ");
		c1.percentualEntrada = Double.parseDouble(input.nextLine());
		
		System.out.print("Digite o numero de parcelas: ");
		c1.qtdParcelas = Integer.parseInt(input.nextLine());
		
		
//		c2.ano = 2019;
//		c2.cor = "Vermelho";
//		c2.marca = "Fiat";
//		c2.modelo = "Toro";
//		c2.placa = "AVA - 9966";
//		c2.preco = 100000;
//		
//		c1.imprimir();
//		c2.imprimir();
		
		c1.imprimirParcela();
//		c2.imprimirParcela();
	}
}
