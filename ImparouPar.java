package Algorr;

import java.util.Scanner;

 public class ImparouPar {

   @SuppressWarnings("resource")
public static void main(String[] args) {
		
	   Scanner scan;
	   int Valor;
	   String Tipo;
	   
	   scan = new Scanner (System.in);
	   System.out.println("Informe O Numero Para Saber Se � Par ou Impar (P_N)");
	   Valor = scan.nextInt();
 if(Valor % 2 == 0) {
   if(Valor >= 0) {
	   Tipo = "Par E Positivo";
	   System.out.printf("O Numero � %s", Tipo);	  
   }
   else {
 if(Valor < 0) {
	 Tipo = "Par � Negativo";
  System.out.printf("O NUmero � %s", Tipo);  
  }
 }
}
 else {
 if(Valor >= 0) {
	 Tipo = "Impar E Positivo";
 System.out.printf("O Numero � %s", Tipo);
 }
 else {
  if(Valor < 0) {
	  Tipo = "impar � Negativo";
 System.out.printf("O Numero � %s", Tipo);
    }
   }
  }
 }
}
