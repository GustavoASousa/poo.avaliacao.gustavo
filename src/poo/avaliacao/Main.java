package poo.avaliacao;

public class Main {
	public static void main(String[] args) {
//		Filme 01 - O Coringa
		Filme f1 = new Filme("Coringa", 2019);
		Ator a1 = new Ator("Joaquin Phoenix", "28/10/1974","Costa Rica");
		Ator a2 = new Ator("Robert De Niro", "17/08/1943","Estados Unidos");
		Diretor d1 = new Diretor("Todd Phillips", "20/12/1970");
		Musico m1 = new Musico("HILDUR GUÐNADÓTTIR", "04/09/1982","Musica internacional / Trilha sonora");
		
		f1.getAtores().add(a1);
		f1.getAtores().add(a2);
		
		a1.getFilmes().add(f1);
		a2.getFilmes().add(f1);
		
		f1.setDiretor(d1);
		d1.getFilmes().add(f1);
		
		f1.getMusicos().add(m1);
		m1.getFilmes().add(f1);
		
//		Filme 02 - Tropa de Elite
		Filme f2 = new Filme("Tropa de Elite", 2007);
		Ator b1 = new Ator("Wagner Moura", "27/07/1976","Brasil");
		Ator b2 = new Ator("André Ramiro", "14/01/1981", "Brasil");
		Ator b3 = new Ator("Milhem Cortaz", "06/12/1972", "Brasil");
		Ator b4 = new Ator("Fábio Lago", "13/03/1970","Brasil");
		Diretor d2 = new Diretor("José Padilha", "01/08/1967");
		Musico m2 = new Musico("Pedro Bromfman", "20/01/1976", "Musica Nacional / Trilha sonora");
		
		f2.getAtores().add(b1);
		f2.getAtores().add(b2);
		f2.getAtores().add(b3);
		f2.getAtores().add(b4);
		
		b1.getFilmes().add(f2);
		b2.getFilmes().add(f2);
		b3.getFilmes().add(f2);
		b4.getFilmes().add(f2);
		
		
		f2.setDiretor(d2);
		d2.getFilmes().add(f2);
		
		f2.getMusicos().add(m2);
		m2.getFilmes().add(f2);
		
		// Imprimir filme 01:
		System.out.println("--//--\\--//--\\-  FILME 1  -//--\\--//--\\--//--\\--");
		f1.imprimir();
		System.out.println("====================================================================");
		for (Ator a : f1.getAtores()) {
			a.imprimir();
			System.out.println(" ");
		}
		d1.imprimir();
		System.out.println(" ");
		for (Musico m : f1.getMusicos())
			m.imprimir();
		System.out.println("====================================================================");
		
		// Imprimir filme 02:
		System.out.println("--//--\\--//--\\-  FILME 2  -//--\\--//--\\--//--\\--");
		f2.imprimir();
		System.out.println("====================================================================");
		for (Ator a : f2.getAtores()) {
			a.imprimir();
			System.out.println(" ");
		}
		d2.imprimir();
		System.out.println(" ");
		for (Musico m : f2.getMusicos())
			m.imprimir();
		System.out.println("====================================================================");
		
		
		
	}
}
