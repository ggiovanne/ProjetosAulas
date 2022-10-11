package Aula20;

public class certo {

	public static void main(String[] args) {

		int[] vetorA = { 10, 2, 3, 4, 5, 5, 4, 8, 2, 10 };

		boolean palindromo = true;

		// ler do 0 ate < 5
		for (int i = 0; i < vetorA.length / 2; i++) {

			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
			
		} if (palindromo) {
			System.out.println("O número é palíndromo");
		} else {
			System.out.println("O número NÃO é palíndromo");
		}

	}
}
