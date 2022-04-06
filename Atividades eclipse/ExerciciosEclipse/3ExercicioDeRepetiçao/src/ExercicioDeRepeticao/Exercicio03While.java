package ExercicioDeRepeticao;

import java.util.Scanner;

public class Exercicio03While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		

		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	    // idade for =-99. (WHILE)  
		
		
		   int cont1=0 ;  
		   int cont2=0 ;
		   int idade = 0; 
		   int cont3 =0;
		   Scanner ler = new Scanner(System.in);
		   
		   
		   while (idade < 99) { 
		   System.out.println(" Digite a sua idade ");  
		   System.out.println();
		   idade =  ler.nextInt() ; 
		   
		   if (idade <=21) { 
		   cont1 ++ ;  
		   }
		   else if (idade > 50) { 
			   cont2 ++ ;
		   } 
		     
		   if  (idade < 50  )   
		   if  (idade > 21)
			   cont3++;
		   { 
			   System.out.println(" Pessoas entre 21 e 50 :" + cont3);
		   }
			System.out.println(" O total de pessoas com menos de 21 anos :" + cont1); 
			System.out.println();
			System.out.println(" O total de pessoas com mais de 50 anos :" + cont2);

		   }  
		   
	}

		   

	} 




