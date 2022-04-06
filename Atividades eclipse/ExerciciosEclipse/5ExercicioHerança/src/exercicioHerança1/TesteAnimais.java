package exercicioHerança1;

public class TesteAnimais {

	public static void main(String[] args) { 
		
		Pasaros Pa = new Pasaros ();  
		aquaticos Aq = new aquaticos(); 
		Mamiferos Ma = new Mamiferos (); 
		 
		

		Pa.setNome("Andorinha"); 
		Pa.setIdade(5); 
		Pa.setVoar("sim"); 
		 
		
		System.out.println(" Qual a especia do nosso passaro :"+ Pa.getNome()); 
		System.out.println(" Qual a idade do nosso passaro : " + Pa.getIdade()); 
		System.out.println(" Nosso passaro esta em possibilidade de voar :"+ Pa.getVoar()); 
		System.out.println(); 
		
		Aq.setNome("Tubarão"); 
		Aq.setIdade(50); 
		Aq.setNadar("sim");
		 
		System.out.println(" Qual a especie de nosso animal marinho :" + Aq.getNome()); 
		System.out.println(" Qual a idade do nosso animal marinho:" + Aq.getIdade()); 
		System.out.println(" Nosos animal marinho está possibilitado a nadar :"+ Aq.getNadar() ); 
		System.out.println(); 
		 
		Ma.setNome("Leão"); 
		Ma.setIdade(16); 
	    Ma.setCorrer("Sim"); 
	    
	    System.out.println(" Qual a especie do nosso mamifero :"+ Ma.getNome()); 
	    System.out.println("Qual a idade do nosso mamifero :"+ Ma.getIdade()); 
	    System.out.println(" Nosso mamifero esta´pronto pra correr :"+ Ma.getCorrer());
	}

}
