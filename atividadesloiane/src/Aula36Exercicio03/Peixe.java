package Aula36Exercicio03;

public class Peixe extends Animal {

	private String características;

	public Peixe(String nome, float comprimento, int numPatas, String cor, double velocidade, String ambiente,
			String caracteristicas) {
		super(nome, comprimento, numPatas, cor, velocidade, ambiente);
		this.características = caracteristicas;
	}

	public void atributos() {
		System.out.println("NOME: " + this.getNome());
		System.out.println("COMPRIMENTO: " + this.getComprimento());
		System.out.println("NÚMERO DE PATAS: " + this.getNumPatas());
		System.out.println("COR: " + this.getCor());
		System.out.println("AMBIENTE: " + this.getAmbiente());
		System.out.println("VELOCIDADE: " + this.getVelocidade());
		System.out.println("CARACTERÍSTICAS: " + this.getCaracterísticas());
	}

	public String getCaracterísticas() {
		return características;
	}

	public void setCaracterísticas(String características) {
		this.características = características;
	}

}
