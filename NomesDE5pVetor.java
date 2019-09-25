package Algorr;

import java.util.Scanner;

public class NomesDE5pVetor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   	  
	 int Idade;
	   
    System.out.println("Digite Quantidade De Pessoas: ");
    Idade = scan.nextInt();
		 
	   int A[] = new int[Idade];
	
	   for (int i = 0; i < Idade; i++) {
	       System.out.println("Digite A idade " + (i + 1) + "º Pessoa: ");
	       A[i] = scan.nextInt();		   
	   }	   
	   
	   for (int i = 0; i < Idade; i++) {
		System.out.println("O Idade Da " + (i +1) + "º  Pessoa é: " + A[i]);
	   }
	   if(18 < Idade) {
		   
		   System.out.println("A Maioria Das Pessoas é Adulta: ");		   
	   }  else {
		   System.out.println("A Maioria Das Pessoas Não é Adulta: ");
	  	   	   
	   }
	 }
  }

  
