package ExercicioDeRepeticao;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {
 
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) 
		
		int Par =0; 
		int Impar=0;  
		int numero=0;
		 
		Scanner scan = new Scanner (System.in); 
		for ( int i = 0 ; i < 11 ; i++ ) { 
		System.out.println(" Digite um numero : "); 
		numero = scan.nextInt(); 
		if ( numero % 2 == 0) { 
			Par++;
		} 
		else {
			Impar ++;
		} 
		System.out.println(" voce Digitou " + Par  + " numeros pares e "+ Impar+" impares");
		}
	}	
		}
				
					
				
				
			
		
		
	


