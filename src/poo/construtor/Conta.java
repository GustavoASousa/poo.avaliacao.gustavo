package poo.construtor;

import javax.sound.midi.Soundbank;

public class Conta {
	String correntista;
	int numero;
	double saldo;
	double limite;
	double sacar;
	
	public Conta () {
		limite = 100;
	}
	void imprimir() {
		System.out.println("Nome: " + correntista
				+ "\nNº: " + numero
				+ "\nSaldo: R$ " + saldo
				+ "\nLimite: R$ " + limite);
	}
	
	void saque(double quantidade) {
		if (quantidade > saldo + limite){
			System.out.println("O saque não pode ser realizado");
		}
		else {
			if (quantidade > saldo) {
				quantidade = quantidade - saldo;
				saldo = 0;
				limite = limite - quantidade;
			}
			else {
				saldo = saldo - quantidade;
			}
			System.out.println("Saque realizado com sucesso! " );
			System.out.println("Saldo : " + saldo);
			System.out.println("limite " + limite);
		}
	}
	
}
