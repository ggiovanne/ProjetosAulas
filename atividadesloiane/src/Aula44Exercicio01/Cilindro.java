package Aula44Exercicio01;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;

	public Cilindro(String nome, String cor, double raio, double altura) {
		super(nome, cor);
		this.raio = raio;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.pow(raio, 2) * Math.PI;
		double areaLateral = 2 * Math.PI * raio * altura;
		return (2 * areaBase) + areaLateral;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * Math.pow(raio, 2) * altura;
	}

}
