package Aul34Ex01;

public class Contador {
	
	private static int contador;
	
	public static void zerar() {
		contador = 0;
	}
	
	public static void incrementar () {
		contador += 1;
	}
	
	public static int retornarValor () {
		return contador; 
	}
}
