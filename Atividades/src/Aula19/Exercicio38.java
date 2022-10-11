package Aula19;

import java.util.Scanner;

//Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo
//e tamanho, sendo que cada elemento de B deverá ser o seguinte
//somatório: Bi = Somatório de Aj, para todo j variando de i até 10.
public class Exercicio38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		int sm = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			for (int j = 0; j < vetorA.length; j++) {
				sm = sm + vetorA[j];
				vetorB[i] = sm;
			}
		}	
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("VETOR A [" + i + "] = " + vetorA[i]);
				System.out.println("VETOR B [" + i + "] = " + vetorB[i]);
			}
	}
}
