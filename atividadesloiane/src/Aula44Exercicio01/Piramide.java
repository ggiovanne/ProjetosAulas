package Aula44Exercicio01;

public class Piramide extends Figura3D {

	private double aresta;
	private double altura;
	private double apotema;
	private int numeroPoligonosBase;
	private Figura2D base;

	public Piramide(String nome, String cor, double aresta, double altura, double apotema, int numeroPoligonosBase,
			Figura2D base) {
		super(nome, cor);
		this.aresta = aresta;
		this.altura = altura;
		this.apotema = apotema;
		this.numeroPoligonosBase = numeroPoligonosBase;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			return (numeroPoligonosBase * aresta * apotema / 2) + base.calcularArea();
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return base.calcularArea() * altura / 3;
		}
		return 0;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public int getNumeroPoligonosBase() {
		return numeroPoligonosBase;
	}

	public void setNumeroPoligonosBase(int numeroPoligonosBase) {
		numeroPoligonosBase = numeroPoligonosBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

}
