package poo.encapsulamento2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		Produto p = new Produto();
		
		System.out.print("Descri��o: ");
		p.setDescricao(input.nextLine());
		
		System.out.print("Marca: ");
		p.setMarca(input.nextLine());
		
		System.out.print("Pre�o: ");
		p.setPreco(Double.parseDouble(input.nextLine()));
		
//		imprimir
		System.out.println("Preco a vista: " + p.getPrecoAVista(p.getPreco()));
		System.out.println("Pre�o 30 dias: " + p.getPreco30Dias(p.getPreco()));
		System.out.println("Pre�o 3 vezes: " + p.getPreco3Vezes(p.getPreco()));
		System.out.println("Pre�o Comiss�o: " + p.getValorComissao(p.getPreco()));
		
		
		

	}

}
