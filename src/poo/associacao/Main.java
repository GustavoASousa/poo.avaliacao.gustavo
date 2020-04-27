package poo.associacao;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Zé");
		f1.setSalario(3000);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Maria");
		f2.setSalario(4000);
		
		Departamento d1 = new Departamento();
		d1.setDescricao("contabilidade");
		
//		Faz associação entre funcionario e departamento
		f1.setDepartamento(d1);// um
		d1.getFuncionarios().add(f1);//muitos
		
		f2.setDepartamento(d1);
		d1.getFuncionarios().add(f2);
		
	}

}
