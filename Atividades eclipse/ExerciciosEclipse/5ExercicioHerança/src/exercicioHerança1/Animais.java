package exercicioHerança1;

public class Animais { 
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
   comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
   características de forma que tudo o que for comum a todos os animais fique na classe
   Animal:*/ 
	
	 private String nome ;
	 private int idade; 
	 private String correr; 
	private String nada;
	 private String voar ;
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public String getNadar() {
		return nada;
	}
	public void setNadar(String nadar) {
		this.nada = nadar;
	}
	public String getVoar() {
		return voar;
	}
	public void setVoar(String voar) {
		this.voar = voar;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
