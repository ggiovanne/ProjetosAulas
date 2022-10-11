package Aula19;

import java.util.Scanner;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa
//que determine a soma dos elementos armazenados neste vetor que
//são múltiplos de 5.
public class Exercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 0;

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número do vetor A: ");
			vetorA[i] = sc.nextInt();
		}

		System.out.println("------------------------");
	
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				total = total + vetorA[i];

			}
		}System.out.print("A soma total dos valores múltiplos de 5 é: " + total);
	}	
}
