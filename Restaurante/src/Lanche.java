
public class Lanche extends Item {
	
	private float peso;
	private String nome;
	private String ingredientes;
	
	//CONSTRUTOR
	public Lanche(double p, float peso, String nome, String ingredientes) {
		super(p);
		this.peso = peso;
		this.nome = nome;
		this.ingredientes = ingredientes;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
}
