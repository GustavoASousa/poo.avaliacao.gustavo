package poo.associacao2;

import java.util.LinkedList;
import java.util.Scanner;

import poo.encapsulamento.Pessoa;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		LinkedList<Cidade> cidades = new LinkedList();
		LinkedList<Pessoa> pessoas = new LinkedList();
		while (menu != 8) {
			System.out.println("CADASTRO DE PESSOAS");
			System.out.println("-------------------");
			System.out.println("Selecione a opção desejada:");
			System.out.println("1-Inserir Cidade");
			System.out.println("2-Inserir Pessoa");
			System.out.println("3-Listar Cidades");
			System.out.println("4-Listar Pessoas");
			System.out.println("5-Pessoa mais velha");
			System.out.println("6-Pessoa mais nova");
			System.out.println("7-Quantidade de pessoas por cidade");
			System.out.println("8-Sair");
			
			menu = Integer.parseInt(sc.nextLine());
			if(menu ==1) {
//				inserir cidade
				Cidade c = new Cidade();
				System.out.print("Digite o nome da cidade: ");
				c.setCidade(sc.nextLine());
				System.out.print("Digite o UF: ");
				c.setUf(sc.nextLine());
				
				cidades.add(c);
			}else if(menu == 2) {
//				inserir pessoa
				Pessoa p = new Pessoa();
				System.out.print("Digite o nome da pessoa: ");
				p.setNome(sc.nextLine());
				System.out.print("Digite a idade: ");
				p.setIdade(Integer.parseInt(sc.nextLine()));
				
				System.out.println("Digite o código da cidade: ");
				for (int i = 0; i < cidades.size(); i++) {
					System.out.print(i + "-");
					cidades.get(i).imprimeCidade();	
				}
				int idcidade = Integer.parseInt(sc.nextLine());
				
//				pega o codigo da cidade que o usuário escolher
				Cidade cid = cidades.get(idcidade);
				
//				amarra a pessoa à cidade
				p.setCidade(cid);
				
//				adiciona a pessoa na cidade
				cid.getPessoa().add(p);
				
			
			}else if(menu == 3) {
//				listar cidades
				for (int i = 0; i < cidades.size(); i++) {
					System.out.println(i + "- ");
					cidades.get(i).imprimeCidade();
					
				}
			}else if(menu == 4) {
//				listar pessoas
				for (int i = 0; i < cidades.size(); i++) {
					Cidade cid = cidades.get(i);
					cid.imprimeCidade();
					cid.imprimePessoas();
					System.out.println("-----------");
				}
			}else if(menu == 5) {
//				pessoa mais velha
				Pessoa pmaior = null;
				for (Cidade cid : cidades) {
					for (Pessoa p : pessoas) {
						if (pmaior == null) {
							pmaior = p;
						}
						else if (p.getIdade()>pmaior.getIdade()) {
							pmaior = p;
						}
					}
					
				}
				System.out.println("A pessoa mais velha é: ");
				pmaior.imprimePessoa();
				

				
			}else if(menu == 6) {
				
			}else if(menu == 7) {
				
			}else if(menu == 8) {
//				sair
			}
			
		}
	}
}
