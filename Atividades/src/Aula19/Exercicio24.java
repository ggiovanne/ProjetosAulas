package Aula19;

import java.util.Scanner;

//24. Números palíndromos são aqueles que escritos da direita para a
//esquerda têm o mesmo valor quando escritos da esquerda para a
//direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
//programa que verifique se um dado vetor A de 10 elementos inteiros é
//um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
//último, se o segundo elemento do vetor é igual ao penúltimo e assim
//por diante até verificar todos os elementos ou chegar a conclusão que
//o vetor não é um palíndromo.

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetorA[i] = sc.nextInt();
		}

		System.out.println("-------------------------------------------------------");
		
		if (vetorA[0] == vetorA[9] && vetorA[1] == vetorA[8] && vetorA[2] == vetorA[7] && vetorA[3] == vetorA[6]
				&& vetorA[4] == vetorA[5]) {
			System.out.print("O número digitado foi: ");
			for (int a = 0; a < vetorA.length; a++) {
				System.out.print(vetorA[a]);
			}
			System.out.println(" e ele é palíndromo!");
		} else {
			System.out.print("O número digitado foi: ");
			for (int a = 0; a < vetorA.length; a++) {
				System.out.print(vetorA[a]);
			}
			System.out.println(" e ele NÃO é palíndromo!");
		}
		System.out.println("------------------------------------------------------");
	}

}
