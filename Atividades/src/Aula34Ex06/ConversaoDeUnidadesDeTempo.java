package Aula34Ex06;

public class ConversaoDeUnidadesDeTempo {

	static int converterMinutosEmSegundos (int min) {
		return min * 60;
	}
	
	static int converterHoraEmMinutos (int hora) {
		return hora * 60;
	}
	
	static int converterDiaEmHoras (int dias) {
		return dias * 24;
	}
	
	static int converterSemanaEmDias (int sem) {
		return sem * 7;
	}
	
	static int converterMesEmdias (int mes) {
		return mes * 30;
	}
	
	static double converterAnoEmDias (int ano) {
		return ano * 365.25;
	}
}
