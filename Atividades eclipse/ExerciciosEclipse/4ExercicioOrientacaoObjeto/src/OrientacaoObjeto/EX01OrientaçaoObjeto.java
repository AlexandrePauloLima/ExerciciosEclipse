package OrientacaoObjeto;

public class EX01OrientaçaoObjeto {
      /*Crie uma classe cliente e apresente os atributos e métodos referentes
        esta classe, em seguida crie um objeto cliente, defina as instancias deste
        objeto e apresente as informações deste objeto no console.*/
 
	public String nome ; 
	public int troco ;
	public int idade ;  
	public int dinheiroCliente;  
	public int ClienteDev ; 
	
	
	 
	void cliente  (int ClienteDev) { 
		troco = ClienteDev - dinheiroCliente;
	}
} 

