package Aula36Exercicio03;

public class Programa {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", 2.0, "Terra");
		camelo.atributos();
		System.out.println("-------------------------------------");
		
		Animal tubarao = new Peixe("Shark", 300, 0, "Cinzento", 1.5, "Mar", "Barbatanas e cauda");
		tubarao.atributos();
		System.out.println("-------------------------------------");
		
		Animal ursoDoCanada = new Mamifero("Biscoito", 180, 4, "Vermelho", 0.5, "Terra", "Mel");
		ursoDoCanada.atributos();
	}

	

}
