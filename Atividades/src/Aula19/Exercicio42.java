package Aula19;

import java.util.Scanner;

//42. Ler 10 elementos inteiros em um vetor A e colocá-los em ordem
//crescente e apresentar os elementos ordenados.

public class Exercicio42 {

	public static void main(String[] args) {

		int troca = 0;
		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor A: ");
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorA.length; j++) {
				if (vetorA[i] < vetorA[j]) {
					troca = vetorA[i];
					vetorA[i] = vetorA[j];
					vetorA[j] = troca;

				}

			}
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}

	}

}
