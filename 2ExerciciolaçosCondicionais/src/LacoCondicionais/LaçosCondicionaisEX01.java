package LacoCondicionais;

import java.util.Scanner;

public class La�osCondicionaisEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 
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
			System.out.println(" O maior numero digitado � : " + numero1);
		    } 
		
		
		if (numero2 > numero1)
	    if (numero2 > numero3) {
	    	System.out.println(" O maior numero digitado � :" + numero2);
	    } 
	    else if( numero3>numero1) 
	           { 
	    	System.out.println(" O maior numero digitado � : "+ numero3);
	    }
		
	 
	    	
	 
	    }
		
	}



