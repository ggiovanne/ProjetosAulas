package Aula36Exercicio03;

public class Animal {

	private String nome;
	private float comprimento;
	private int numPatas;
	private String cor;
	private double velocidade;
	private String ambiente;

	public void atributos() {
		System.out.println("NOME: " + this.getNome());
		System.out.println("COMPRIMENTO: " + this.getComprimento());
		System.out.println("NÚMERO DE PATAS: " + this.getNumPatas());
		System.out.println("COR: " + this.getCor());
		System.out.println("AMBIENTE: " + this.getAmbiente());
		System.out.println("VELOCIDADE: " + this.getVelocidade());
	}

	public Animal(String nome, float comprimento, int numPatas, String cor, double velocidade, String ambiente) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.velocidade = velocidade;
		this.ambiente = ambiente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

}
