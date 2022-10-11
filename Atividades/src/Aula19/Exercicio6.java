package Aula19;

import java.util.Scanner;

//6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//um vetor C, onde cada elemento de C é a soma dos respectivos
//elementos em A e B, ou seja:
//C[i] = A[i] + B[i].
public class Exercicio6 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor A: ");
			vetorA[i] = sc.nextInt();
			
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor B: ");
			vetorB[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			for (int a = 0; a < vetorB.length; a++) {
				vetorC[i] = vetorA[i] + vetorB[i];
			}

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
