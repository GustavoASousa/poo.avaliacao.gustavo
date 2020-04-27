package poo.encapsulamento2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		Produto p = new Produto();
		
		System.out.print("Descrição: ");
		p.setDescricao(input.nextLine());
		
		System.out.print("Marca: ");
		p.setMarca(input.nextLine());
		
		System.out.print("Preço: ");
		p.setPreco(Double.parseDouble(input.nextLine()));
		
//		imprimir
		System.out.println("Preco a vista: " + p.getPrecoAVista(p.getPreco()));
		System.out.println("Preço 30 dias: " + p.getPreco30Dias(p.getPreco()));
		System.out.println("Preço 3 vezes: " + p.getPreco3Vezes(p.getPreco()));
		System.out.println("Preço Comissão: " + p.getValorComissao(p.getPreco()));
		
		
		

	}

}
