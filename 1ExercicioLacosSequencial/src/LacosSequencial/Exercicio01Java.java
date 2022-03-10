package LacosSequencial;  

import java.util.Scanner; 


public class Exercicio01Java {

	public static void main(String[] args) {
		/*  1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		 
		Scanner leia = new Scanner (System.in);  
		int ano =2022 , anoN,mes = 30 , dia = 365, dias,diaN;
		 
	
		 
		System.out.println("Digite o ano que voce nasceu :"); 
		anoN = leia.nextInt(); 
		System.out.println("Digite o mes que voce nasceu :"); 
		mes= leia.nextInt();
		System.out.println("Digite o dia que voce nasceu :");  
		diaN = leia.nextInt(); 
		dias = (ano-anoN)*dia ;
		 
		System.out.println("Desde do seu dia de nascimento ate agora voce tem :"+ dias);
		

	}

}
