package Aula34Ex02;

public class Calculadora {

	public static double somar (double n1, double n2) {
		return n1 + n2;
	}
	
	public static double subtrair (double n1, double n2) {
		return n1 - n2;
	}
	
	public static double multiplicar (double n1,double n2) {
		return n1 * n2;
	}
	
	public static double dividir (double n1,double n2) {
		return n1 / n2;
	}
	
	public static double elevarPotencia (double n1,int potencia) {
		return Math.pow(n1, potencia);
	}
	
	public static int calcularfactorial (int n1) {
		if (n1 == 0) {
			return 1;
		}
		
		int cont = 1;
		for (int i = n1; i > 1; i--) {
			cont *= i;
		}
		return cont;
				
				
	}
}
