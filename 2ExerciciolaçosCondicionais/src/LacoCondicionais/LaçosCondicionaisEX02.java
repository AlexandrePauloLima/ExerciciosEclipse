package LacoCondicionais;
 
import java.util.Scanner; 

public class LaçosCondicionaisEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Faça um programa que entre com três números e coloque em ordem crescente.  
		
		
	 
		 
		Scanner entrada = new Scanner (System.in); 
		
	   int n1=0 , n2=0 , n3=0 ; 
		
		System.out.println(" Digite o primerio numero : "); 
		n1 = entrada.nextInt();  
		
		 
		System.out.println(" Digite o segundo numero : "); 
		n2 = entrada.nextInt();  
		
	
		System.out.println(" Digite o terceiro numero : "); 
		n3 = entrada.nextInt(); 
		 
		if (n1>n2 && n2 >n3)
		 { 
		System.out.println(" 1- Os numeros em orde crescente são : " + n3 +","+ n2 +","+ n1 ); 
		}
       
        if (n1>n3 && n3>n2) 
        { 
        	System.out.println(" 2- O numeros em ordem crescente são : "+ n2 +","+n3 +","+n1 ); 
        	
        } 
        if (n2>n1 && n1>n3) 
        { 
        	System.out.println(" 3- O numeros em ordem crescente são : " + n3 +","+ n1 +"," +n2);
        }
        if (n2>n3 && n3>n1) 
        { 
        System.out.println(" 4- O numeros em ordem crescente são : "+ n1 +","+ n3 +","+ n2); 
        
        }
		if (n3>n2 && n2>n1) 
		{ 
		System.out.println(" 5- O numeros em ordem crescente são : "+n1 +","+n2 +","+ n3 ); 			
		} 
		if (n3>n1 && n1>n2) 
		{ 
			System.out.println(" 6- O numeros em ordem crescente são : " +n2 +","+ n1 +","+ n3 );
		} 
		
		
	}

}
