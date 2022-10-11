package Aula44Exercicio01;

public class Circulo extends Figura2D implements DimensaoSuperficial {

	private double raio;

	public Circulo(String nome, String cor, double raio) {
		super(nome, cor);
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return raio * raio * Math.PI;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
