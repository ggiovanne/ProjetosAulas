package Aula19;

import java.util.Scanner;

//29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
//sendo este a junção dos dois outros vetores. Os primeiros 10
//elementos de C deverão receber os elementos de A e os últimos
//elementos C deverão receber os elementos de B. Desta forma, C
//deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor A: ");
			vetorA[i] = sc.nextInt();
			vetorC[i] = vetorA[i];

		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor B: ");
			vetorB[i] = sc.nextInt();
			vetorC[i + 10] = vetorB[i];
		}

		System.out.print("VETOR A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();

		System.out.print("VETOR B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");

		}
		System.out.println();

		System.out.print("VETOR C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");

		}

	}
}
