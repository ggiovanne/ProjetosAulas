package Aula02;

public class Programa {
	public static void main(String[] args) {
		Caneta bic = new Caneta ();
		bic.carga = 4;
		bic.cor = "Azul";
		bic.modelo = "Tinteiro";
		bic.tampa = true;
		
		bic.tampar();
		bic.rabiscar();
		bic.destampar();
		bic.rabiscar();
		
	}
}
