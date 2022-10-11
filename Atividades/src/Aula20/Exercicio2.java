package Aula20;

import java.util.Random;

//2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//qual é o maior e o menor valor da coluna 7.

public class Exercicio2 {

	public static void main(String[] args) {

		int maior = 0;
		int menor = 0;

		Random sorteio = new Random();

		int matrizM[][] = new int[10][10];

		for (int i = 0; i < matrizM.length; i++) {
			for (int a = 0; a < matrizM.length; a++) {
				matrizM[i][a] = sorteio.ints(0, 9).findFirst().getAsInt();
			}
		}
		System.out.println("---------------------");
		System.out.println("       MATRIZ M      ");
		System.out.println("---------------------");
		for (int i = 0; i < matrizM.length; i++) {
			for (int a = 0; a < matrizM[0].length; a++) {

				System.out.print(matrizM[i][a] + " ");
			}
			System.out.println();

		}
		System.out.println("---------------------");

		for (int i = 0; i < matrizM.length; i++) {
			maior = matrizM[4][0];
			menor = matrizM[4][0];
			for (int a = 0; a < matrizM.length; a++) {

				if (maior < matrizM[4][a]) {
					maior = matrizM[4][a];
				}
				if (menor > matrizM[4][a]) {
					menor = matrizM[4][a];
				}
			}
		}

		System.out.println("O maior número da linha 5 é: " + maior);
		System.out.println("O menor número da linha 5 é: " + menor);
		System.out.println("----------------------------------");

		maior = matrizM[0][6];
		menor = matrizM[0][6];
		for (int i = 0; i < matrizM.length; i++) {

			for (int a = 0; a < matrizM.length; a++) {

				if (maior < matrizM[i][6]) {
					maior = matrizM[i][6];
				}
				if (menor > matrizM[i][6]) {
					menor = matrizM[i][6];
				}
			}
		}
		System.out.println("O maior número da coluna 7 é: " + maior);
		System.out.println("O menor número da coluna 7 é: " + menor);

	}

}