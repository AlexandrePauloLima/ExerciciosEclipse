package LacoCondicionais; 

import java.util.Scanner;

public class LaçosCondicionaisEX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
        categoria ela se encontra:
         10-14 infantil
         15-17 juvenil
          18-25 adulto */ 
		
	
          Scanner entrada = new Scanner (System.in);  
          int idade = 0 ;
          
          
          System.out.println(" Digite qual a sua idade :"); 
          idade=entrada.nextInt(); 
           
          if (idade >=10 ) {  
        	  if (idade <=14)
        	  System.out.println(" voce se encaixa na categoria infantil "); 
        	   }   
          
          if (idade >=15 ) {  
        	  if (idade <=17)
        	   System.out.println("Voce se encaixa na categoria juvenil ");  
          }
           if (idade >=18) { 
        		  if (idade <=25) 
        			  System.out.println(" Voce se encaixa na categoria adulta ");
        	  } 
           else  {  
        	   
        	 
        		  System.out.println(" Voce nao se encaixa em nem uma das categorias ");
        	  } 
           if ( idade >= 26) { 
        	   System.out.println(" Voce nao se encaixa em nem uma das categorias ");
           }
          
         
        	  
          } 
          
	}

