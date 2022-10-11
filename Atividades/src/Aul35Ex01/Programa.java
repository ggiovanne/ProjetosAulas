package Aul35Ex01;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Qual número deseja ver o ser fibonacci? ");
		int resposta = sc.nextInt();
		
		System.out.println(Fibonacci.fibonacci(resposta));
	}
}
