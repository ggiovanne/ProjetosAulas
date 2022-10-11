package Aula34Ex06;

public class Programa {

	static void imprimir(double numero) {
		System.out.println(numero);
	}

	public static void main(String[] args) {

		
		imprimir(ConversaoDeUnidadesDeTempo.converterAnoEmDias(2));
		imprimir(ConversaoDeUnidadesDeTempo.converterDiaEmHoras(7));
		imprimir(ConversaoDeUnidadesDeTempo.converterHoraEmMinutos(24));
		imprimir(ConversaoDeUnidadesDeTempo.converterMesEmdias(5));
		imprimir(ConversaoDeUnidadesDeTempo.converterMinutosEmSegundos(5));
		imprimir(ConversaoDeUnidadesDeTempo.converterSemanaEmDias(3));
	}
}
