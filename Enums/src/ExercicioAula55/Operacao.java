package ExercicioAula55;

public enum Operacao {

	SOMAR("+") {
		@Override
		public double fazerConta(double a, double b) {
			return a + b;
		}
	}, SUBTRAIR("-") {
		@Override
		public double fazerConta(double a, double b) {
			return a - b;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double fazerConta(double a, double b) {
			return a * b;
		}
	}, DIVIDIR("/") {
		@Override
		public double fazerConta(double a, double b) {
			return a / b;
		}
	};
	
	private String operador;
	
	Operacao(String operador) {
		this.operador = operador;
	}
	
	public abstract double fazerConta (double a, double b);	
	@Override
	public String toString() {
		return this.operador;
	}
}
