package poo.encapsulamento2;

public class Produto {
	private String descricao;
	private String marca;
	private double preco;
	
//	Set's
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
//	Get's
	public String getDescricao() {
		return descricao;
	}
	public String getMarca() {
		return marca;
	}
	public double getPreco() {
		return preco;
	}
	
	
	public double getPrecoAVista(double preco) {
		this.preco = preco - (preco * 0.1);
		return this.preco;
	}
	public double getPreco30Dias(double preco) {
		this.preco = preco + (preco * 0.05);
		return this.preco;
	}
	public double getPreco3Vezes(double preco) {
		this.preco = preco + (preco * 0.15);
		return this.preco;
	}
	public double getValorComissao(double preco) {
		this.preco = preco * 0.07;
		return this.preco;
	}
	
}
