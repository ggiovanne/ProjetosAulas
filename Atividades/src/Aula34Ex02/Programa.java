package Aula34Ex02;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int resposta = 0;
		while (resposta < 1) {
			System.out.print ("Digite um número que deseja fatorar: ");
			resposta = sc.nextInt();
		}
		System.out.println(Calculadora.calcularfactorial(resposta));
		
		
	}
}
