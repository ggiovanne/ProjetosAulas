package Aula44Exercicio01;

public class Cubo extends Figura3D{

	private double lado;

	public Cubo(String nome, String cor, double lado) {
		super(nome, cor);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 6 * lado * lado;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

}
