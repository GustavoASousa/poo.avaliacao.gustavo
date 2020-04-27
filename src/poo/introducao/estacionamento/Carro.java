package poo.introducao.estacionamento;

import java.text.DecimalFormat;

public class Carro {
// atributos
	String cor;
	String placa;
	int ano;
	String modelo;
	String marca;
	double preco;
	double percentualEntrada;
	int qtdParcelas;
	
//	método
	double calcularIPVA() {
		double ipva = ano < 1980 ? 0 : preco * 0.04;
		return ipva;	
	}
	
	
	void imprimir() {
		System.out.println(" Modelo: " + modelo +
				"\n Marca: "+ marca +
				"\n Placa: " + placa +
				"\n Ano: " + ano + 
				"\n Cor: "+ cor +
				"\n Preço: " + preco +
				"\n IPVA: " + calcularIPVA()+
				"\n ");
	}
	
	void imprimirParcela() {
		DecimalFormat formataNumero = new DecimalFormat("#.00");
		double entrada = preco * (percentualEntrada/100);
		double restante = preco - entrada;
		double jurosTotal = 0.025 * qtdParcelas;
		double valorJuros = restante * jurosTotal;
		double valorFinal = restante+ valorJuros;
		double parcela = valorFinal/qtdParcelas;
		System.out.println("O valor da parcela é de R$ " + formataNumero.format(parcela));
	}
}
