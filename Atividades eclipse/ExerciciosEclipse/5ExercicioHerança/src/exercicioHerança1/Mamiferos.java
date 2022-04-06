package exercicioHerança1;

public class Mamiferos extends  Animais{ 
	 
	 private String nome ; 
	 private int idade; 
	 private String correr;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) { 
		this.nome = nome;
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
	

}
