package principal;

import basica.Contato;
import linked.Ligada;

public class main {

	public static void main(String[] args) {
			
		Ligada lista = new Ligada();
		Contato c0 = new Contato("Fulano","1234567");
		Contato c1 = new Contato("Sicrano","09832131");
		Contato c2 = new Contato("Cicero","13214567");
		Contato c3 = new Contato("Ricardo","13214567");
		Contato c4 = new Contato("Farias","1323123");
		Contato c5 = new Contato("Lima","974321321");
		Contato c6 = new Contato("Junior","2312321");

		
		lista.adicionarFim(c0);
		lista.adicionarFim(c1);
		lista.adicionarFim(c2);
		lista.adicionarFim(c3);

		lista.imprimir();
		lista.verificar();
		
		lista.remove();
		lista.remove();
		lista.remove();
		
		
		lista.adicionarFim(c4);

		lista.imprimir();
		lista.verificar();
		
	}

}
