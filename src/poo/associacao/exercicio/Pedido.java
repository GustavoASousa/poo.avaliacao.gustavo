package poo.associacao.exercicio;

public class Pedido {
	private int codPedido;
	private Cliente cliente = new Cliente();
	
	public void setCod(int codPedido) {
		this.codPedido = codPedido;
	}
	public int getCod() {
		return codPedido;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
}
