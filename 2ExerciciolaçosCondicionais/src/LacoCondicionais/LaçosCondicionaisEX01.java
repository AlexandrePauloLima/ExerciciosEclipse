package LacoCondicionais;

import java.util.Scanner;

public class LaçosCondicionaisEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
 
		Scanner entrada = new Scanner (System.in); 
		
		double numero1, numero2, numero3 ;  
		 
		System.out.println("Digite o primerio numero : "); 
		numero1 = entrada.nextDouble(); 
		 
		System.out.println("Digite o segundo numero: "); 
		numero2 = entrada.nextDouble(); 
		 
		System.out.println("Digite o terceiro numero: "); 
		numero3 = entrada.nextDouble(); 
		 
		if (numero1 > numero2  ) 
		    if (numero1>numero3) {
			System.out.println(" O maior numero digitado é : " + numero1);
		    } 
		
		
		if (numero2 > numero1)
	    if (numero2 > numero3) {
	    	System.out.println(" O maior numero digitado é :" + numero2);
	    } 
	    else if( numero3>numero1) 
	           { 
	    	System.out.println(" O maior numero digitado é : "+ numero3);
	    }
		
	 
	    	
	 
	    }
		
	}



