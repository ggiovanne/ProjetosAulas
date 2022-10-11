package Aul34Ex01;

public class Programa {
	public static void main(String[] args) {
		
		Contador.incrementar();
		Contador.incrementar();
		System.out.println(Contador.retornarValor());
		Contador.zerar();
		System.out.println(Contador.retornarValor());
	}
}
