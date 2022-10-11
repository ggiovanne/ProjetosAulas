package Aula36Exercicio03;

public class Mamifero extends Animal {

	private String alimento;

	public void atributos() {
		System.out.println("NOME: " + this.getNome());
		System.out.println("COMPRIMENTO: " + this.getComprimento());
		System.out.println("NÚMERO DE PATAS: " + this.getNumPatas());
		System.out.println("COR: " + this.getCor());
		System.out.println("AMBIENTE: " + this.getAmbiente());
		System.out.println("VELOCIDADE: " + this.getVelocidade());
		System.out.println("ALIMENTO: " + this.getAlimento());
	}

	public Mamifero(String nome, float comprimento, int numPatas, String cor, double velocidade, String ambiente,
			String alimento) {
		super(nome, comprimento, numPatas, cor, velocidade, ambiente);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

}
