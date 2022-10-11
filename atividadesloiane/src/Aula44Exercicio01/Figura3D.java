package Aula44Exercicio01;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica{

	public Figura3D(String nome, String cor) {
		super(nome, cor);
	}

	public abstract double calcularVolume();

}