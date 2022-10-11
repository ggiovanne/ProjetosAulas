package Aula19;

import java.util.Scanner;

//23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//que verifique se "todos" os elementos do vetor A são pares. Se pelo
//menos um elemento do vetor não for par o processo de repetição para
//percorrer os elementos do vetor deve ser encerrado, como sugestão:
//utilize uma variável do tipo flag para atingir este propósito.
public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print ("Digite o " + (i + 1) + "º número: ");
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.println("O " + (i + 1) + "º número é: " + vetorA[i]);
			} else {
				break;
			}
		}
	}
}
