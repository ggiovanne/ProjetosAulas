
public class Bebida extends Item {
	
	private String nome;
	private int volume;
	private boolean bebidaAlcoolica;
	
	//CONSTRUTOR
	public Bebida(double p, String nome, int volume, boolean bebidaAlcoolica) {
		super (p);
		this.nome = nome;
		this.setVolume(volume);
		this.bebidaAlcoolica = bebidaAlcoolica;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isBebidaAlcoolica() {
		return bebidaAlcoolica;
	}
	public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
		this.bebidaAlcoolica = bebidaAlcoolica;
	}
}
