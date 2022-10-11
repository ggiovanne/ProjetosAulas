package Dias;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double n5 = 0;
		double n6 = 0;
		double media1;
		double media2;
		double somaMedias;
		double mediaDasMedias;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos tirar a média de alguns números:");
		System.out.println("Digite o 1º número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o 2º número: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o 3º número: ");
		n3 = sc.nextDouble();
		System.out.println("Digite o 4º número: ");
		n4 = sc.nextDouble();
		System.out.println("Digite o 5º número: ");
		n5 = sc.nextDouble();
		System.out.println("Digite o 6º número: ");
		n6 = sc.nextDouble();
		
		media1 = (n1 + n2 + n3) / 3;
		media2 = (n4 + n5 + n6) / 3;
		somaMedias = media1 + media2;
		mediaDasMedias = somaMedias / 2;
		
		System.out.println("A média de " + n1 +", " + n2 + " e " + n3 + " é: " + media1);
		System.out.println("A média de " + n4 + ", " + n6 + " e " + n6 + " é: " + media2);
		System.out.println("A soma das medias " + media1 + " e " + media2 + " é: " + somaMedias);
		System.out.println("A media das médias é: " + mediaDasMedias);
	}
}
