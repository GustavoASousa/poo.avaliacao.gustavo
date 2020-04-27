package poo.associacao;

import java.util.LinkedList;

public class Departamento {
	private String descricao;
	private LinkedList<Funcionario> funcionarios = new LinkedList();
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public LinkedList<Funcionario> getFuncionarios(){
		return funcionarios;
	}
}
