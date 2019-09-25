package Algorr;
import java.util.Scanner;
public class FaixaP {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     int N;
     System.out.println("Digite Um Número");
     N = scan.nextInt();
     if(N <= 1){
     }else {
    	 System.out.println("O Valor Não Está Na Faixa");
     } if (N >= 9){
     }else 
    	 System.out.println("O Valor Está Na Faixa Permitida");     
    }   
 }

