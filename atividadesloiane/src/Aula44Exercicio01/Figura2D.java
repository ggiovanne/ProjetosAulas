package Aula44Exercicio01;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

	public Figura2D(String nome, String cor) {
		super(nome, cor);
	}

	@Override
	public abstract double calcularArea();

}
