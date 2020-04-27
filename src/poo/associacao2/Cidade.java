package poo.associacao2;

import java.util.LinkedList;

public class Cidade {

	private String cidade;
	private String uf;
	private LinkedList<Pessoa> pessoas = new LinkedList<>();
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getUf() {
		return uf;
	}
	
	public void setPessoa(LinkedList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public LinkedList<Pessoa> getPessoa(){
		return pessoas;
	}
	
	public void imprimeCidade() {
		System.out.println(cidade + "/" + uf);
	}
	public void imprimePessoas() {
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.print(i + "-");
			pessoas.get(i).imprimePessoa();
		}
	}
}
