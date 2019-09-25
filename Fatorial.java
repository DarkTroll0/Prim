package Algorr;
public class Fatorial {
	public static void main(String[] args) {
		int Valor = 6, FA = 1;
		for (int I = 2; I <= Valor; I++)
			FA *= I;
System.out.println( "! O FATORIAL DE " + Valor + " É Igual A " + FA + "!");
	}
}
