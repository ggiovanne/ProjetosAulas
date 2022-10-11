package Aula19;

import java.util.Scanner;

//19. Ler as duas notas bimestrais para um conjunto de 10 alunos.
//Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
//tipo real. Escreva um programa que calcule a média aritmética simples
//das notas informadas armazenando o resultado em um vetor “Result”
//de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
//de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
//estará “aprovado”, caso contrário, a situação do aluno será
//“reprovado”.

public class Exercicio19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notas1[] = new double[10];
		double notas2[] = new double[10];
		double media[] = new double[10];

		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Nota 1 do " + (i + 1) + "º aluno: ");
			notas1[i] = sc.nextDouble();
		}

		for (int i = 0; i < notas2.length; i++) {
			System.out.println("Nota 2 do " + (i + 1) + "º aluno: ");
			notas2[i] = sc.nextDouble();
		}

		for (int i = 0; i < media.length; i++) {

			media[i] = (notas1[i] + notas2[i]) / 2;
			System.out.println("A média do " + (i + 1) + "º aluno é: " + media[i]);
		}

	}

}
