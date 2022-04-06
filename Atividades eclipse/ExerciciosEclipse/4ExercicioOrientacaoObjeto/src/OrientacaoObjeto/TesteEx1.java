package OrientacaoObjeto;

public class TesteEx1 { 
	

	public static void main(String[] args) { 
		 
		EX01OrientaçaoObjeto c1 = new EX01OrientaçaoObjeto (); 
		c1.nome = "Alexandre"; 
	    c1.idade = 25 ;  
		c1.dinheiroCliente =250 ;  
		c1.ClienteDev =225 ;   
		
		
		System.out.println(" O nome do cliente "+ c1.nome); 
		System.out.println(" O valor pago pelo cliente :"+ c1.dinheiroCliente); 
		System.out.println(" Devo evolver ao cliente :"+ c1.troco );
		 
	   


	}

}
