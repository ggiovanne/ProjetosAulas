import java.util.Scanner;

public class PrimeiroComando {
	
	public static void main (String[] args) {
		
	Scanner teclado = new Scanner (System.in);
	System.out.print("Digite seu nome: ");
	String nome = teclado.nextLine();
	System.out.print ("Digite a sua nota: ");
	double nota = teclado.nextFloat();
	System.out.format ("A nota de %s é %.2f \n", nome, nota);
	}
}
