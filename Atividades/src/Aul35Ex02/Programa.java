package Aul35Ex02;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para ele some com os demais números até 1: ");
		int resposta = sc.nextInt();

		System.out.println("O resultado é: " +Calculadora.somatorio(resposta));
	}
}
