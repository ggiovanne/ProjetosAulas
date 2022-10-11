package ExercicioAula55;

public class Calculadora {
	public static void main(String[] args) {

		double a = 5.0;
		double b = 3.5;
		
		for (Operacao operacao : Operacao.values()) {
			System.out.print(a + " ");
			System.out.print(operacao.toString() + " ");
			System.out.print(b + " = ");
			System.out.println(operacao.fazerConta(a, b));
		}
		
	}
}
