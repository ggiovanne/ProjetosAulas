
public abstract class Item  {
	private double preco;

	//METODO CONSTRUTOR
	public Item(double p){
		preco = p;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
