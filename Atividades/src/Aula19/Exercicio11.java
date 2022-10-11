package Aula19;

import java.util.Scanner;

//11.Criar um vetor A com 10 elementos inteiros. Implementar um programa
//que defina e escreva a quantidade de elementos armazenados neste
//vetor que são pares.

public class Exercicio11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor A: ");
			vetorA[i] = sc.nextInt();

		}

		System.out.println("----------------------------------------");
		System.out.print("NÚMEROS PARES DO VETOR A: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print(vetorA[i] + " ");
			}
		}
		
	}

}
