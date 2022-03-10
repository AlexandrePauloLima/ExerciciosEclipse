package ExercicioDeRepeticao;

import java.util.Scanner;

public class Exercicio04while {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
          psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
          era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
          (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
          agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
          pessoas, calcule e mostre: (WHILE)
           o número de pessoas calmas;
           o número de mulheres nervosas;
           o número de homens agressivos;
           o número de outros calmos;
           o número de pessoas nervosas com mais de 40 anos;
           o número de pessoas calmas com menos de 18 anos.*/ 
		 
		
		int generoO = 0;
		int pessoas=0;
		int calma=0;
		int nervosa=0 ; 
	    int agressivo=0;
	    int calmo=0;
	    int nervosa40 = 0; 
	    int calma18=0;  
	    int  idade = 0; 
	    int genero=0 ; 
	    int sentimento=0; 
	    int homenA = 0 ;
	    int mulherN = 0;
	    int pessoasC = 0;
	    Scanner ler = new Scanner(System.in); 
	     
	    while (pessoas< 150) {
	    	pessoas ++;
	    
	    
	   
	    System.out.println(" Qual a sua idade :");  
	    idade = ler.nextInt();  
	   
	    System.out.println("Assinale o seu gelero "
	    		+ "1 Masculino "
	    		+ "2 Femenino "
	    		+ "3 para outros :" ); 
	    genero = ler.nextInt(); 
	   
	    System.out.println(" Assinale qual das alternativas voce se encaixa "
	    		+ " 1 Calma."
	    		+ " 2 Nervosa."
	    		+ " 3 Agressiva."); 
	    sentimento = ler.nextInt(); 
	    
	    if (idade <0 ) {
	    	pessoas++;
	    }
	    
	    if ( idade > 0 && sentimento ==1) {
	    	pessoasC++;
	    
	    
	    }
	    if (genero == 3 && sentimento ==1 ) {
	    	generoO++;
	    }
	    	
	    	
	    if (genero == 2 && sentimento == 2) {
	    	mulherN ++;
	    }
	    if (genero ==1 && sentimento ==3) {
	    	homenA ++;
	    }
	    
	  
	    if  (idade > 40  && sentimento ==2 ) { 
	    	 nervosa40 ++;
	    	
	    }
	    if (idade < 18 && sentimento == 1) {
	            	 calma18 ++;
	    }
		  
		  
		  
		   
		   
	    
	    System.out.println(" Quantidado de pessoas digitada no sistema :"+ pessoas);
	   System.out.println("O número de pessoas calmas: " + pessoasC); 
	   System.out.println("O número de mulheres nervosas : " + mulherN );
	   System.out.println("O número de homens agressivos:"+ homenA); 
	   System.out.println("O número de outros calmos : "+ generoO);
	   System.out.println("O número de pessoas nervosas com mais de 40 anos :"  + nervosa40); 
	   System.out.println("O número de pessoas calmas com menos de 18 anos:" + calma18);
	    }
	    
	      
	     
	    	
	
		

	}

	private static Object nextline() {
		// TODO Auto-generated method stub
		return null;
	}

}
 