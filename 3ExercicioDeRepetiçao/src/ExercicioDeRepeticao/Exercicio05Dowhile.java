package ExercicioDeRepeticao;

import java.util.Scanner;

public class Exercicio05Dowhile {

	public static void main(String[] args) {
		//Crie um programa que leia um n�mero do teclado at� que encontre um
		//n�mero igual a zero. No final, mostre a soma dos n�meros
		//digitados.(DO...WHILE) 
		
				
	
                 int numero = 0;
                 int para = 10;
                 int  soma = 0;
                 Scanner scan = new Scanner(System.in);

                 do {
	             System.out.print("Digite um numero: ");
	             numero = scan.nextInt();

	             if (numero == 0) {
	            	para = 0;
              	} else {
	        	soma += numero;
             	}
                } while (para != 0);

                System.out.println("Soma dos numeros digitados: " + soma);

    }
   }