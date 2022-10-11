import java.util.Calendar;

public class Treino {
	public static void main(String[] args) {
		
		Calendar data =Calendar.getInstance();
		
		int ano = data.get(Calendar.YEAR);
		int mes = data.get(Calendar.MONTH);
		int dia = data.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("Hoje é: %02d/%d/%d", dia, mes, ano);
		
		String semana1 = "quarta";
		String semana2 = "quartA";
		System.out.println();
		System.out.println(semana1.equalsIgnoreCase(semana2));
		// no metodo acima ele ignora maiuscula e minuscula.
	}
}
