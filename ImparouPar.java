package Algorr;

import java.util.Scanner;

 public class ImparouPar {

   @SuppressWarnings("resource")
public static void main(String[] args) {
		
	   Scanner scan;
	   int Valor;
	   String Tipo;
	   
	   scan = new Scanner (System.in);
	   System.out.println("Informe O Numero Para Saber Se É Par ou Impar (P_N)");
	   Valor = scan.nextInt();
 if(Valor % 2 == 0) {
   if(Valor >= 0) {
	   Tipo = "Par E Positivo";
	   System.out.printf("O Numero É %s", Tipo);	  
   }
   else {
 if(Valor < 0) {
	 Tipo = "Par É Negativo";
  System.out.printf("O NUmero É %s", Tipo);  
  }
 }
}
 else {
 if(Valor >= 0) {
	 Tipo = "Impar E Positivo";
 System.out.printf("O Numero É %s", Tipo);
 }
 else {
  if(Valor < 0) {
	  Tipo = "impar É Negativo";
 System.out.printf("O Numero É %s", Tipo);
    }
   }
  }
 }
}
